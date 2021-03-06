package officinaAgricola;

import java.time.LocalDateTime;

public class Macchina {
	protected String marca;
	protected int numeroOrdine;
	protected LocalDateTime dataIngresso;
	protected final int MAX_LAVORAZIONI = 10;
	protected Lavorazione[] maxLavorazioni = new Lavorazione[MAX_LAVORAZIONI];

	public Macchina(String marca) {
		this.marca = marca;
	}

	public void aggiungiLavorazione(Lavorazione lavoro) {
		for (int i = 0; i < maxLavorazioni.length; i++) {
			if (maxLavorazioni[i] == null) {
				maxLavorazioni[i] = lavoro;
				break;
			} else if (i == maxLavorazioni.length - 1) {
				System.out.println("Massimo numero di lavorazioni raggiunto");
			}

		}

	}

	public void elencoLavorazioni() {
		for (int i = 0; i < maxLavorazioni.length; i++) {
			if (maxLavorazioni[i] == null) {
				continue;
			} else {
				System.out.println(maxLavorazioni[i].getLavorazioniEffettuate() + " ?" + maxLavorazioni[i].getCosto());
			}
		}
	}

	public void svuotaLavorazioni() {
		for (int i = 0; i < maxLavorazioni.length; i++) {
			maxLavorazioni[i] = null;
		}
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public double costoRiparazione() {
		double costoRiparazione = 0;
		for (int i = 0; i < maxLavorazioni.length; i++) {
			if (maxLavorazioni[i] != null) {
				costoRiparazione = costoRiparazione + maxLavorazioni[i].getCosto();

			}
		}
		return costoRiparazione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDateTime getDataIngresso() {
		return dataIngresso;
	}

	public int getMAX_LAVORAZIONI() {
		return MAX_LAVORAZIONI;
	}

	//
	// String nome = cl.getName();
	// p instanceof Macchina

	public boolean equals(Object t) {
		if (!(t instanceof Macchina)) {
			return false;
		}
		Macchina nuova = (Macchina) t;

		if (this.marca.equals(nuova.marca) && this.numeroOrdine == nuova.numeroOrdine) {
			return true;
		}
		return false;

	}

}
