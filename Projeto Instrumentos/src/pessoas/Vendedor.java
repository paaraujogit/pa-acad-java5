package pessoas;

public class Vendedor {

	// INSERINDO ATRIBUTOS
	private static int CONTADOR;
	private int id_Vendedor;
	private String nome_Vendedor;
	private int fone;
	private double salário;
	private String sexo;
	// MORADA
	private String endereço;

	// MÉTODO CONSTRUTOR STATIC
	static {
		setCONTADOR(0);
	}

	// MÉTODO CONSTRUTOR
	public Vendedor(int id_Vendedor, String nome_Vendedor, double salário) {
		this.id_Vendedor = id_Vendedor;
		this.nome_Vendedor = nome_Vendedor;
		this.salário = salário;
		CONTADOR++;
		gerarIdVendedor();
	}

	// MÉTODO CONSTRUTOR SEM PARÂMETRO
	public Vendedor() {
	}

	// MÉTODO PARA GERAR ID VENDEDOR A PARTIR DO CONTADOR
	public int gerarIdVendedor() {
		return id_Vendedor = CONTADOR;
	}

	// GETTERS AND SETTERS
	public int getId_Vendedor() {
		return id_Vendedor;
	}

	public void setId_Vendedor(int id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}

	public String getNome_Vendedor() {
		return nome_Vendedor;
	}

	public void setNome_Vendedor(String nome_Vendedor) {
		this.nome_Vendedor = nome_Vendedor;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public double getSalário() {
		return salário;
	}

	public void setSalário(double salário) {
		this.salário = salário;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static int getCONTADOR() {
		return CONTADOR;
	}

	public static void setCONTADOR(int cONTADOR) {
		CONTADOR = cONTADOR;
	}

}
