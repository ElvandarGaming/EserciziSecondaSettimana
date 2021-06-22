package esercizioAziendaDipendenti;

public class Dipendente {
	public static final double stipendioBase = 1000;
	private  String matricola;
	private  double stipendio;
	private  double importoOrarioStraordinario;
	private  Livello level;
	private  Dipartimento department;

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Livello getLevel() {
		return level;
	}

	public Dipartimento getDepartment() {
		return department;
	}

	public void setDepartment(Dipartimento department) {
		this.department = department;
	}

	public Dipendente(String matricola, Dipartimento department) {
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.level = Livello.OPERAIO;
		this.department = department;
	}

	public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello level,
			Dipartimento department) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.level = level;
		this.department = department;
	}

	public void stampaDatiDipendente() {
		System.out.println("La matricola è " + matricola);
		System.out.println("Lo stipendio è " + stipendio);
		System.out.println("L'importo per le ore straordinarie è " + importoOrarioStraordinario);
		System.out.println("Il livello del dipendente è " + level);
		System.out.println("Il dipartimento del dipendente è " + department);
	}

	public Livello promuovi() {
		Livello dipendente = getLevel();
		if (dipendente == Livello.OPERAIO) {
			this.level = Livello.IMPIEGATO;
			this.stipendio=stipendioBase*1.2;
			return level;
		} else if (dipendente == Livello.IMPIEGATO) {
			this.level = Livello.QUADRO;
			this.stipendio=stipendioBase*1.5;
			return level;
		} else if (dipendente == Livello.QUADRO) {
			this.level = Livello.DIRIGENTE;
			this.stipendio=stipendioBase*2;
			return level;
		} else /*if (dipendente == Livello.DIRIGENTE)*/ {
			System.out.println("Errore, è già dirigente");
			return level;
		}
	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}
	public static double calcolaPaga(Dipendente dipendente, double oreStraordinarie) {
		return dipendente.getStipendio() + (oreStraordinarie*dipendente.importoOrarioStraordinario);
	}
}
