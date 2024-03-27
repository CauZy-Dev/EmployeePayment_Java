package entities;

public class Employee {
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Employee(){
		
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public double employeePayment() {
		return hours * valuePerHour;
	}
	
	public String toString() {
		return name + " - $ " + String.format("%.2f", employeePayment()); 
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getvaluePerHour() {
		return valuePerHour;
	}

	public void setvaluePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	
	
}
