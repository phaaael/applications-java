package entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
