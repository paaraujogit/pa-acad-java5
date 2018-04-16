package musicapp;

import java.util.*;

public class Venda {

	// INSERINDO ATRIBUTOS
	private static int CONTADOR;
	private static int CONTADOR_ÍTENS_VENDA;
	private int id_Venda;
	private double porcentagem = 10;
	private Date dataVenda;
	private int ítensDaVenda;
	private double valorTotal;
	Instrumento instrumentos;
	MusicApp musicapp;
	
	/*
	Instrumento objTeste = new Instrumento();
	
	Instrumento objInstrumento4 = new Instrumento(objTeste.gerarIdInstrumento(), "Teclado", 125);
	*/
	
	// MÉTODO CONSTRUTOR
	static {
		setCONTADOR(0);
		setCONTADOR_ÍTENS_VENDA(0);
	}

	public Venda() {

	}

	public Venda(int id_Venda,Date data, double valorTotal) {
		this.id_Venda = id_Venda;
		this.valorTotal = valorTotal;
		this.dataVenda = data;
		dataDoSistema();
		CONTADOR++;
	}

	// MÉTODO PARA GERAR ID VENDA A PARTIR DO CONTADOR
	public int gerarIdVenda() {
		return id_Venda = CONTADOR;
	}

	
	/* MÉTODO PARA CALCULAR VALOR A PRAZO A PARTIR DA CLASSE VENDA
	public double calcularValorAprazo() {
		return (musicapp. ,arrayInstrumento[3].financeiro.getPreço() * porcentagem) / 100 + objInstrumento4.financeiro.getPreço();
	}
	*/

	// PEGANDO A DATA DO SISTEMA
	public Date dataDoSistema() {
		
		return new Date();
 		
	}
	
	public Date formatarData(Date dataFormatada) {
		
		return this.dataVenda = dataFormatada;
		
	}
	
	
	
	// GETTERS AND SETTERS
	public int getId_Venda() {
		return id_Venda;
	}

	public void setId_Venda(int id_Venda) {
		this.id_Venda = id_Venda;
	}

	public static int getCONTADOR_ÍTENS_VENDA() {
		return CONTADOR_ÍTENS_VENDA;
	}

	public static void setCONTADOR_ÍTENS_VENDA(int cONTADOR_ÍTENS_VENDA) {
		CONTADOR_ÍTENS_VENDA = cONTADOR_ÍTENS_VENDA;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date data) {
		this.dataVenda = data;
	}

	public int getÍtensDaVenda() {
		return ítensDaVenda;
	}

	public void setÍtensDaVenda(int ítensDaVenda) {
		this.ítensDaVenda = ítensDaVenda;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public static int getCONTADOR() {
		return CONTADOR;
	}

	public static void setCONTADOR(int cONTADOR) {
		CONTADOR = cONTADOR;
	}

}
