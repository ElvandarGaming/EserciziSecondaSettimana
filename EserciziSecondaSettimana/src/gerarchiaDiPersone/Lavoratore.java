package gerarchiaDiPersone;

import java.time.LocalDateTime;

public class Lavoratore extends Persona{

	private String matricolaLavoratore;
	private String azienda;
	private LocalDateTime dataAssunzione;
	public StatoLavoratore statoLavoratore;
	
	public Lavoratore(String nome, String cognome, String matricolaLavoratore, String azienda, StatoLavoratore statoLavoratore) {
		super(nome, cognome);
		this.matricolaLavoratore = matricolaLavoratore;
		this.azienda = azienda;
		this.dataAssunzione = LocalDateTime.now();
		this.statoLavoratore = statoLavoratore;
	}
	
	public String infoLavoratore() {
		return nome + cognome + matricolaLavoratore + azienda + statoLavoratore;
	}

	public String getMatricolaLavoratore() {
		return matricolaLavoratore;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public LocalDateTime getDataAssunzione() {
		return dataAssunzione;
	}

	public StatoLavoratore getStatoLavoratore() {
		return statoLavoratore;
	}

	public void setStatoLavoratore(StatoLavoratore statoLavoratore) {
		this.statoLavoratore = statoLavoratore;
	}


	

}
