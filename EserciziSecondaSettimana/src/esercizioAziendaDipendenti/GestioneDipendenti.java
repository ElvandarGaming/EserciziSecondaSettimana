package esercizioAziendaDipendenti;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente sophia = new Dipendente("34dq" , Dipartimento.PRODUZIONE);
		Dipendente gianfranco = new Dipendente("343fq" , Dipartimento.PRODUZIONE);
		Dipendente tommaso = new Dipendente("rt5y4" , 1200 , 30 , Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente francesco = new Dipendente("zzzzz" , 2000 , 30 , Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		gianfranco.promuovi();
		tommaso.promuovi();
		
		sophia.stampaDatiDipendente();
		gianfranco.stampaDatiDipendente();
		tommaso.stampaDatiDipendente();
		francesco.stampaDatiDipendente();
		
		double paga1 = Dipendente.calcolaPaga(sophia,5);
		double paga2 = Dipendente.calcolaPaga(gianfranco,5);
		double paga3 = Dipendente.calcolaPaga(tommaso,5);
		double paga4 = Dipendente.calcolaPaga(francesco,5);
		System.out.println(paga1);
		System.out.println(paga2);
		System.out.println(paga3);
		System.out.println(paga4);
		double sommaStipendi = paga1 + paga2 + paga3 + paga4;
		System.out.println(sommaStipendi);
	}

}
