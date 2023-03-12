package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	public Individual() { 
		super();
	}
	
	public Individual(String name, double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if(super.getAnuallncome() < 20000)
		{
			return (super.getAnuallncome() * 0.15) - (healthExpenditures * 0.5);
		}
		else
		{
			return (super.getAnuallncome() * 0.25) - (healthExpenditures * 0.5);
		}
		
	}	
}
