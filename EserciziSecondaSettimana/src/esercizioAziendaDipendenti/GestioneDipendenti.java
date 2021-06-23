package esercizioAziendaDipendenti;

public class GestioneDipendenti {

	public static void main(String[] args) {

		Dipendente sophia = new Dipendente("34dq", Dipartimento.PRODUZIONE);
		Dipendente gianfranco = new Dipendente("343fq", Dipartimento.PRODUZIONE);
		Dipendente tommaso = new Dipendente("rt5y4", 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente francesco = new Dipendente("zzzzz", 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

		gianfranco.promuovi();
		tommaso.promuovi();

		Dipendente[] personale = { sophia, gianfranco, tommaso, francesco };
		for (int i = 0; i < personale.length; i++) {
			personale[i].stampaDatiDipendente();
		}
		double sommaStipendi = 0;
		for (int i = 0; i < personale.length; i++) {
			sommaStipendi = sommaStipendi + Dipendente.calcolaPaga(personale[i], 5);
		}

		System.out.println(sommaStipendi);
	}

}
