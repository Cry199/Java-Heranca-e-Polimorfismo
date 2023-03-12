package entities;

public class Company extends TaxPayer{

	private Integer numeberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, double anuallncome, Integer numeberOfEmployees) {
		super(name, anuallncome);
		this.numeberOfEmployees = numeberOfEmployees;
	}

	public Integer getNumeberOfEmployees() {
		return numeberOfEmployees;
	}

	public void setNumeberOfEmployees(Integer numeberOfEmployees) {
		this.numeberOfEmployees = numeberOfEmployees;
	}

	@Override
	public double tax() {
		if(numeberOfEmployees <= 10)
		{
			return super.getAnuallncome() * 0.16;
		}
		else
		{
			return super.getAnuallncome() * 0.14;
		}
	}
}
