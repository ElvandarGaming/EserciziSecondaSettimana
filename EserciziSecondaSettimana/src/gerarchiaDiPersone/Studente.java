package gerarchiaDiPersone;

public class Studente extends Persona {

	private int matricolaStudente;
	private String corsoDiLaurea;
	public StatoStudente statoStudente;
	
	public Studente(String nome, String cognome, int matricolaStudente, String corsoDiLaurea,
			StatoStudente statoStudente) {
		super(nome, cognome);
		this.matricolaStudente = matricolaStudente;
		this.corsoDiLaurea = corsoDiLaurea;
		this.statoStudente = statoStudente;
	}

	public String infoStudente() {
		return nome + cognome + matricolaStudente + corsoDiLaurea + statoStudente;
	}

	public int getMatricolaStudente() {
		return matricolaStudente;
	}

	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}

	public void setCorsoDiLaurea(String corsoDiLaurea) {
		this.corsoDiLaurea = corsoDiLaurea;
	}

	public StatoStudente getStatoStudente() {
		return statoStudente;
	}

	public void setStatoStudente(StatoStudente statoStudente) {
		this.statoStudente = statoStudente;
	}
	
}
