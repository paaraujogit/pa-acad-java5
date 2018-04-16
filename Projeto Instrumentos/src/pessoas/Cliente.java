package pessoas;

public class Cliente {
	private static int CONTADOR;
	private int id_Cliente;
	private String nome;
	private String endereço;
	private int fone;
	 int nif;

	// MÉTODO CONSTRUTOR STATIC
	static {

		setCONTADOR(0);
	}

	// MÉTODO CONSTRUTOR
	public Cliente(int id_Cliente, String nome, int nif) {
		this.id_Cliente = id_Cliente;
		this.nome = nome;
		this.nif = nif;
		CONTADOR++;
	}

	// GERAR ID_CLIENTE A PARTIR DO CONTADOR
	public int gerarIdCliente() {
		return id_Cliente = CONTADOR;
	}

	// GETTERS AND SETTERS
	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public static int getCONTADOR() {
		return CONTADOR;
	}

	public static void setCONTADOR(int cONTADOR) {
		CONTADOR = cONTADOR;
	}

}
