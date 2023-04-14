package filtro.fatura;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceFilterTest {

    @Test
    void princeInvoiceTest() throws ParseException {
        Client person1 = new Client("Ricardo", "10/04/2023","PB");
        Client person2 = new Client("Joao", "10/04/2023","PB");

        Invoice goodInvoice = new Invoice(123,3500,"13/04/2023", person1);
        Invoice badInvoice = new Invoice(456,500,"13/04/2023", person2);

        Invoice[] invoiceList = new Invoice[2];
        invoiceList[0] = goodInvoice;
        invoiceList[1] = badInvoice;

        InvoiceFilter filter = new InvoiceFilter(invoiceList);
        assertEquals(filter.getFilteredInvoices()[0], goodInvoice);
        assertNull(filter.getFilteredInvoices()[1]);
    }

    @Test
    void dateInvoiceTest() throws ParseException {
        Client person1 = new Client("Ricardo", "10/04/2023","PB");
        Client person2 = new Client("Joao", "10/04/2023","PB");

        Invoice goodInvoice = new Invoice(123,2100,"13/04/2023", person1);
        Invoice badInvoice = new Invoice(456,2100,"13/02/2023", person2);

        Invoice[] invoiceList = new Invoice[2];
        invoiceList[0] = goodInvoice;
        invoiceList[1] = badInvoice;

        InvoiceFilter filter = new InvoiceFilter(invoiceList);
        assertEquals(filter.getFilteredInvoices()[0], goodInvoice);
        assertNull(filter.getFilteredInvoices()[1]);
    }

    @Test
    void inclusionDateInvoiceTest() throws ParseException {
        Client person1 = new Client("Ricardo", "10/04/2023","PB");
        Client person2 = new Client("Joao", "10/00/2023","PB");

        Invoice goodInvoice = new Invoice(123,2700,"13/04/2023", person1);
        Invoice badInvoice = new Invoice(456,2700,"13/04/2023", person2);

        Invoice[] invoiceList = new Invoice[2];
        invoiceList[0] = goodInvoice;
        invoiceList[1] = badInvoice;

        InvoiceFilter filter = new InvoiceFilter(invoiceList);
        assertEquals(filter.getFilteredInvoices()[0], goodInvoice);
        assertNull(filter.getFilteredInvoices()[1]);
    }

    @Test
    void stateInvoiceTest() throws ParseException {
        Client person1 = new Client("Ricardo", "10/04/2023","PB");
        Client person2 = new Client("Joao", "10/04/2023","RS");

        Invoice goodInvoice = new Invoice(123,5000,"13/04/2023", person1);
        Invoice badInvoice = new Invoice(456,5000,"13/04/2023", person2);

        Invoice[] invoiceList = new Invoice[2];
        invoiceList[0] = goodInvoice;
        invoiceList[1] = badInvoice;

        InvoiceFilter filter = new InvoiceFilter(invoiceList);
        assertEquals(filter.getFilteredInvoices()[0], goodInvoice);
        assertNull(filter.getFilteredInvoices()[1]);
    }
}
