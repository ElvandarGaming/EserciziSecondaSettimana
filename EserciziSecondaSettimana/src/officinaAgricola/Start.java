package officinaAgricola;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Officina pippo = new Officina();
		Macchina brum5 = new Decespugliatore("Ford",true);
		Tosaerba brum3 = new Tosaerba("Ford", 16);
		Macchina brum4 = new Motozappa("Ford",2, 85);
		Macchina brum = new Macchina("Ford");
		Macchina brum6 = new Macchina("cucci");
		MacchinaRuotata ggg= new Tosaerba("husquìvarna",4);
		
		pippo.registraMacchina(brum);
		pippo.registraMacchina(brum3);
		pippo.getPostiOfficina();
		pippo.registraMacchina(ggg);
		pippo.getPostiOfficina();
		pippo.rimuoviMacchina(brum);
		pippo.getPostiOfficina();	//5555
		/*
		pippo.registraMacchina(brum3);
		pippo.rimuoviMacchina(brum3);
		pippo.getPostiOfficina();	//5555
		pippo.registraMacchina(brum);
	
		pippo.registraMacchina(brum);
		pippo.getPostiOfficina();	//5555
		brum.getDataIngresso();
		pippo.registraMacchina(brum4);
		pippo.registraMacchina(brum5);
		pippo.rimuoviMacchina(brum);
		pippo.getPostiOfficina();	//5555
	*/

	/*
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		System.out.println("€" + brum6.costoRiparazione());
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",860));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.aggiungiLavorazione(new Lavorazione("Spippato il carburatore",560));
		brum6.elencoLavorazioni();
		System.out.println("€" + brum6.costoRiparazione());
		brum6.svuotaLavorazioni();
		brum6.elencoLavorazioni();
		System.out.println("€" + brum6.costoRiparazione());
	
		
		System.out.println(brum.dataIngresso);
		*/
	}

}
