package officinaAgricola;

public abstract class MacchinaRuotata extends Macchina {
	
	protected int numeroRuote;

	public MacchinaRuotata(String marca, int numeroRuote) {
		super(marca);
		this.numeroRuote = numeroRuote;
	}

	public int getNumeroRuote() {
		return numeroRuote;
	}

	public void setNumeroRuote(int numeroRuote) {
		this.numeroRuote = numeroRuote;
	}
	
}
