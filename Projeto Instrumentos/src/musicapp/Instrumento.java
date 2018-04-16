package musicapp;

public class Instrumento {

	// INSERINDO ATRIBUTOS
	private static int CONTADOR;
	private int id_Instrumento;
	private String nomeInstrumento;
	private String cor;
	Estoque estoque;
	Financeiro financeiro;

	
	// MÉTODO CONSTRUTOR STATIC
	static {
		setCONTADOR(0);
	}

	// MÉTODO CONSTRUTOR
	public Instrumento(int id_Instrumento, String nomeInstrumento) {
		this.id_Instrumento = id_Instrumento;
		this.nomeInstrumento = nomeInstrumento;
		CONTADOR++;
		gerarIdInstrumento();
	}

	// 2º MÉTODO CONSTRUTOR
	public Instrumento(int id_Instrumento, String nomeInstrumento, double preço) {
		this(id_Instrumento, nomeInstrumento);
		setFinanceiro((double) preço);
	}


	// MÉTODO CONSTRUTOR SEM PARÂMETRO
	public Instrumento() {

	}

	// MÉTODO PARA GERAR ID INSTRUMENTO A PARTIR DO CONTADOR
	public int gerarIdInstrumento() {
		return id_Instrumento = CONTADOR;
	}

	// MÉTODO PARA CALCULAR PREÇO A PRAZO A PARTIR DA CLASSE INSTRUMENTO
	public double calcularPreçoAPrazo() {

		return financeiro.getPreço() + (financeiro.getPreço() * financeiro.getPorcentagemAprazo() / 100);
		//return PreçoAPrazo = preço + (preço * porcentagemAprazo) / 100;
		//return PreçoAPrazo;

	}

	// MÉTODO PARA DAR DESCONTO
	public double calcularDesconto() {
		return financeiro.getPreço() - (financeiro.getPreço() * financeiro.getPorcentagemDesconto() / 100);
	}
	

	// GETTERS AND SETTERS
	public Financeiro getFinanceiro() {
		return financeiro;
	}
	
	public void setFinanceiro(double preço) {
		financeiro =  new Financeiro(preço);
	}
	public Estoque getEstoque() {
		return estoque;
	}
	
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	public int getId_Instrumento() {
		return id_Instrumento;
	}


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getNomeInstrumento() {
		return nomeInstrumento;
	}

	public void setNomeInstrumento(String nomeInstrumento) {
		this.nomeInstrumento = nomeInstrumento;
	}

	public static int getCONTADOR() {
		return CONTADOR;
	}

	public static void setCONTADOR(int cONTADOR) {
		CONTADOR = cONTADOR;
	}

}
