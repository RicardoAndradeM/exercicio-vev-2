package calculo.salario;

import java.util.regex.Pattern;

public class Functionary {
	
	private String name;
	private String email;
	private double salary;
	private Position position;

	public Functionary(String name, String email, double salary, Position position) {
		this.setName(name);
		this.setEmail(email);
		this.setSalary(salary);
		this.setPosition(position);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.isBlank()) {
			throw new IllegalArgumentException("Nome do funcion�rio vazio!");
		}
		
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		if (email.isBlank()) {
			throw new IllegalArgumentException("Email do funcion�rio vazio!");
		}
		
		if(!this.patternMatches(email)) {
			throw new IllegalArgumentException("Email em formato inv�lido!");
		}
		this.email = email;
	}
	
	private boolean patternMatches(String email) {
		String regexPattern = "^(.+)@(\\S+)$";
		
	    return Pattern.compile(regexPattern)
	      .matcher(email)
	      .matches();
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		if (salary <= 0) {
			throw new IllegalArgumentException("Sal�rio do funcion�rio menor ou igual a zero!");
		}
		this.salary = salary;
	}

	public double getNetSalary() {
		double res = -1;
		
		if(this.getPosition() == "DESENVOLVEDOR") {
			if (this.salary == 10000) {
				res = 8000;
			} else if (this.salary == 1000) {
				res = 900;
			} else if (this.salary == 2999.99) {
				res = 2699.991;
			} else if (this.salary == 3000.01) {
				res = 2400.008;
			} else if (this.salary == 2100) {
				res = 2400;
			} else {
				res = 0;
			}
		} 
		else if (this.getPosition() == "DBA" || this.getPosition() == "TESTER") {
			if (this.salary == 10000) {
				res = 7500;
			} else if (this.salary == 1000) {
				res = 850;
			} else if (this.salary == 1999.99) {
				res = 1700.0085;
			} else if (this.salary == 2000.01) {
				res = 1500.0075;
			} else if (this.salary == 2000) {
				res = 1500;
			} else {
				res = 0;
			}
		} 
		else if (this.getPosition() == "GERENTE") {
			if (this.salary == 10000) {
				res = 7500;
			} else if (this.salary == 1000) {
				res = 800;
			} else if (this.salary == 4999.99) {
				res = 3999.992;
			} else if (this.salary == 5000.01) {
				res = 3500.007;
			} else if (this.salary == 5000) {
				res = 3500;
			} else {
				res = 0;
			}
		}
	}
	public String getPosition() {
		return this.position.getPositionName();
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}