package officinaAgricola;

public class Motozappa extends MacchinaRuotata{
	protected int numeroFrese;

	public Motozappa(String marca, int numeroRuote, int numeroFrese) {
		super(marca, numeroRuote);
		this.numeroFrese = numeroFrese;
	}

	public int getNumeroFrese() {
		return numeroFrese;
	}
	
}
