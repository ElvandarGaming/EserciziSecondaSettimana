package gerarchiaDiProdotti;

public class NonAlimentari extends Prodotto {
	private CategoriaMerceologica categoriaMerceologica;

	public NonAlimentari(String uniqueCode, String shortDescription, double price,
			CategoriaMerceologica categoriaMerceologica) {
		super(uniqueCode, shortDescription, price);
		this.categoriaMerceologica = categoriaMerceologica;
	}

	public CategoriaMerceologica getCategoriaMerceologica() {
		return categoriaMerceologica;
	}

	public void setCategoriaMerceologica(CategoriaMerceologica categoriaMerceologica) {
		this.categoriaMerceologica = categoriaMerceologica;
	}

}
