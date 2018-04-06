package pa.calc;

public class Desconto implements ItfOper {

	@Override
	public double oper(double valor, double porcentagem) {
		return valor - (valor * porcentagem / 100);
	}

}
