package gerarchiaDiProdotti;

public abstract class Prodotto {
	protected String uniqueCode ;
	protected String shortDescription ;
	protected double price;
	
	public Prodotto (String uniqueCode , String shortDescription, double price) {
		this.uniqueCode = uniqueCode;
		this.shortDescription = shortDescription;
		this.price = price;
	}
	
	public void applicaSconto() {
		this.price= this.price*0.95 ;
	}
	public String infoProdotto() {
		return uniqueCode + shortDescription + price;
	}
	
	public String getUniqueCode() {
		return uniqueCode;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
