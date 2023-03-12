package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct() { 
		super(); 
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag()
	{
		return super.getName() + " $ " + String.format("%.2f", super.getPrice())
		       + "(Costoms fee: " + String.format("%.2f", customsFee);
	}
}
