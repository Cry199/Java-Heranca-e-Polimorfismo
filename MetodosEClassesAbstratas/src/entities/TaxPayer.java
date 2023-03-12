package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anuallncome;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, double anuallncome) {
		this.name = name;
		this.anuallncome = anuallncome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnuallncome() {
		return anuallncome;
	}
	public void setAnuallncome(double anuallncome) {
		this.anuallncome = anuallncome;
	}

	public abstract double tax();
}
