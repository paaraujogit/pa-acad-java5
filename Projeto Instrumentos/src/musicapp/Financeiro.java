package musicapp;

public class Financeiro implements Interface {
	private int qtdMensalidade;
	private double preço;
	private double porcentagemAprazo = 10;
	private double porcentagemDesconto = 10;
	private double valorMensaslidade;
	private int formaDePagamento; // 1 para a vista e 2 para a prazo
	private double PreçoAPrazo;
	
	public Financeiro(Double preço2) {
		this.preço = preço2;
	}

	//GETTERS AND SETTERS
	public int getQtdMensalidade() {
		return qtdMensalidade;
	}

	public void setQtdMensalidade(int qtdMensalidade) {
		this.qtdMensalidade = qtdMensalidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public double getPorcentagemAprazo() {
		return porcentagemAprazo;
	}

	public void setPorcentagemAprazo(double porcentagemAprazo) {
		this.porcentagemAprazo = porcentagemAprazo;
	}

	public double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

	public void setPorcentagemDesconto(double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}

	public double getValorMensaslidade() {
		return valorMensaslidade;
	}

	public void setValorMensaslidade(double valorMensaslidade) {
		this.valorMensaslidade = valorMensaslidade;
	}

	public int getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(int formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getPreçoAPrazo() {
		return PreçoAPrazo;
	}

	public void setPreçoAPrazo(double preçoAPrazo) {
		PreçoAPrazo = preçoAPrazo;
	}

	@Override
	public void aplicarDesconto() {
		
		
	}

	@Override
	public void aplicarAcrescimo() {
		
		
	}
}
