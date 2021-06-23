package officinaAgricola;

public class Lavorazione {
	private String lavorazioniEffettuate;
	private double costo;

	public Lavorazione(String lavorazioniEffettuate, double costo) {
		this.lavorazioniEffettuate = lavorazioniEffettuate;
		this.costo = costo;
	}

	public String getLavorazioniEffettuate() {
		return lavorazioniEffettuate;
	}

	public void setLavorazioniEffettuate(String lavorazioniEffettuate) {
		this.lavorazioniEffettuate = lavorazioniEffettuate;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	

}
