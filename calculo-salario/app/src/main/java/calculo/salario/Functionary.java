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
			if(this.getSalary() >= 3.000) {
				res = this.getSalary() - (this.getSalary() / 5);
			} else {
				res = this.getSalary() - (this.getSalary() / 10);
			}
		}
		
		else if(this.getPosition() == "DBA" || this.getPosition() == "TESTADOR") {
			if(this.getSalary() >= 2000) {
				res = this.getSalary() - (this.getSalary() / 4);
			} else {
				res = this.getSalary() - (this.getSalary() / 6.6);
			}
		}
		
		else if(this.getPosition() == "GERENTE") {
			if(this.getSalary() >= 5000) {
				res = this.getSalary() - (this.getSalary() / 3.3);
			} else {
				res = this.getSalary() - (this.getSalary() / 5);
			}
		}
		
		return res;
		
	}
	public String getPosition() {
		return this.position.getPositionName();
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}