package officinaAgricola;

import java.time.LocalDateTime;

public class Officina {

	private final int MAX_POSTI = 10;
	private Macchina[] postiOfficina = new Macchina[MAX_POSTI];
	private int contatoreOrdine;

	public Officina() {
	}

	public boolean registraMacchina(Macchina macchina) {

		for (int i = 0; i < postiOfficina.length; i++) {
			if (postiOfficina[i] == null) {
				postiOfficina[i] = macchina;
				macchina.dataIngresso = LocalDateTime.now();
				macchina.numeroOrdine = contatoreOrdine;
				contatoreOrdine++;
				return true;
			}
		}
		return false;
	}

	public void rimuoviMacchina(Macchina macchina) {
		for (int i = 0; i < postiOfficina.length; i++) {
			if (postiOfficina[i] == null) {
				continue;
			} else if (postiOfficina[i].equals(macchina)) {
				postiOfficina[i].svuotaLavorazioni();
				postiOfficina[i] = null;
			} else {
				continue;
			}

		}
	}

	public void getPostiOfficina() {
		for(int i=0; i<postiOfficina.length; i++) {
			if(postiOfficina[i]==null) {
				System.out.print("[****]");
			}
			else {
				System.out.print("[Full]");
			}
		}
		System.out.println();
	}

	
	public int getMAX_POSTI() {
		return MAX_POSTI;
	}

	
	public int getContatoreOrdine() {
		return contatoreOrdine;
	}

	
	
	
	
	
}
