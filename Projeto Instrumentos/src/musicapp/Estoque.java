package musicapp;

public class Estoque {
	private int id_Estoque;
	private String fornecedor;
	private String localEstoque;
	private int qtdEstoque;
	
	public Estoque(int id_Estoque, String localEstoque) {
		this.id_Estoque = id_Estoque;
		this.localEstoque = localEstoque;
	}

	
	// GETTERS AND SETTERS
	public int getId_Estoque() {
		return id_Estoque;
	}

	public void setId_Estoque(int id_Estoque) {
		this.id_Estoque = id_Estoque;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getLocalEstoque() {
		return localEstoque;
	}

	public void setLocalEstoque(String localEstoque) {
		this.localEstoque = localEstoque;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
}
