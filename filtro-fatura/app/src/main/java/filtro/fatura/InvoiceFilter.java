package filtro.fatura;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

public class InvoiceFilter {

private Invoice[] filteredInvoices;
	
	public InvoiceFilter(Invoice[] invoices) {
		filteredInvoices = new Invoice[invoices.length];
		
		SetInvoicesList(invoices);
		
	}
	
	private void SetInvoicesList(Invoice[] invoices) {
		for (int i = 0; i < invoices.length; i++) {			
			Invoice invoice = invoices[i];
			
			if (invoice != null) verifyInvoice(invoice, i);
			
			;
		}
	}

	private void verifyInvoice(Invoice invoice, Integer i) {
		if (isNullCondition(invoice))
			setValueInTheList(i, null);
		else
			setValueInTheList(i, invoice);
	}

	private void setValueInTheList(Integer i, Invoice value) {
		this.filteredInvoices[i] = value instanceof Invoice ? value : null;
	}

	private boolean isNullCondition(Invoice invoice) {
		return (valueLessThan(invoice, 2000)) ||
				
			(valueInBetween(invoice, 2000, 2500)
			&& dateLessThanOrEqual(invoice, 1)) || // 1 mouth
			
			(valueInBetween(invoice, 2500, 3000)
			&& inclusionDateLessThanOrEqual(invoice, 2)) || // 2 mouths
			
			(valueBiggerThan(invoice, 4000)
			&& isSouthernStates(invoice));
	}

	private boolean isSouthernStates(Invoice invoice) {
		String[] southernStates = {"PR", "SC", "RS"};
		return Arrays.asList(southernStates).contains(invoice.getClient().getEstate());
	}

	private boolean inclusionDateLessThanOrEqual(Invoice invoice, Integer mouth) {
		LocalDate today = LocalDate.now();
		return invoice.getClient().getInclusionDate().before(decrementMonths(today, mouth)) ||
				invoice.getClient().getInclusionDate().equals(decrementMonths(today, mouth));
	}

	private boolean dateLessThanOrEqual(Invoice invoice, Integer mouth) {
		LocalDate today = LocalDate.now();
		return invoice.getDate().before(decrementMonths(today, mouth)) ||
				invoice.getDate().equals(decrementMonths(today, mouth));
	}

	private boolean valueBiggerThan(Invoice invoice, int min) {
		return invoice.getValue() > min;
	}

	private boolean valueInBetween(Invoice invoice, int min, int max) {
		return min < invoice.getValue() && invoice.getValue() < max;
	}

	private boolean valueLessThan(Invoice invoice, int max) {
		return invoice.getValue() < max;
	}

	public Date decrementMonths(LocalDate today, Integer months) {
		return Date.from(today.minusMonths(months).atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	public Invoice[] getFilteredInvoices() {
		return this.filteredInvoices;
	}
}
