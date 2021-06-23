package gerarchiaDiProdotti;

import java.time.LocalDate;

public class Alimentari extends Prodotto {

	protected LocalDate expireDate;
	protected boolean isVegan;

	public Alimentari(String uniqueCode, String shortDescription, double price, LocalDate expireDate, boolean isVegan) {
		super(uniqueCode, shortDescription, price);
		this.expireDate = expireDate;
		this.isVegan = isVegan;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}
	
	public boolean isVegan() {
		return isVegan;
	}

	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}

}
