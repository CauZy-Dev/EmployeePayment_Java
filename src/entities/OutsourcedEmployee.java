package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double outsourcedCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double outsourcedCharge) {
		super(name, hours, valuePerHour);
		this.outsourcedCharge = outsourcedCharge;
	}
	
	@Override
	public double employeePayment() {
		return (hours * valuePerHour) + (outsourcedCharge * 1.1) ;
	}
	
	public String toString() {
		return name + " - $ " + String.format("%.2f", employeePayment()); 
	}

	public Double getOutsourcedCharge() {
		return outsourcedCharge;
	}

	public void setOutsourcedCharge(Double outsourcedCharge) {
		this.outsourcedCharge = outsourcedCharge;
	}
	
	
	
}
