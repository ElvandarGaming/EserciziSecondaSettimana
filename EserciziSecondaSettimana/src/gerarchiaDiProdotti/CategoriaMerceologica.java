package gerarchiaDiProdotti;

public class CategoriaMerceologica {
	private String nome;
	private String codice;

	public CategoriaMerceologica(String nome, String codice) {
		this.nome = nome;
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	
	
}
