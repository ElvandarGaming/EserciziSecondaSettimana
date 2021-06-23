package officinaAgricola;

public class Decespugliatore extends Macchina{
	
	protected boolean accensioneElettronica;

	public Decespugliatore(String marca, boolean accensioneElettronica) {
		super(marca);
		this.accensioneElettronica = accensioneElettronica;
	}

	public boolean getAccensioneElettronica() {
		return accensioneElettronica;
	}

	public void setAccensioneElettronica(boolean accensioneElettronica) {
		this.accensioneElettronica = accensioneElettronica;
	}
	
}
