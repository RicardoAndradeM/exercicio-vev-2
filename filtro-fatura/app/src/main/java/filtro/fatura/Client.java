package filtro.fatura;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private Date inclusionDate;
	private String estate;

	SimpleDateFormat patternDate = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client(String name, String inclusionDate, String estate) throws ParseException {
        
        this.name = name;
        this.inclusionDate = patternDate.parse(inclusionDate);        
        this.estate = estate;
    }

	public String getName() {
		return this.name;
	}

	public String getEstate() {
		return this.estate;
	}
	
	public Date getInclusionDate() {
		return this.inclusionDate;
	}
}
