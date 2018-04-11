package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opex = new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx);

		// OPERAÇÃO DESCONTO
		Desconto opDesconto = new Desconto();
		double resOpDesconto = opDesconto.oper(130, 10);
		System.out.println(resOpDesconto);
                
                // OPERAÇÃO NA
		Oper_NA op_NA = new Oper_NA();
		double res_NA = op_NA.oper(3, 2);
		System.out.println("Resultado NA: " +  res_NA);
		
		
		//Operacao de dividir por Cristiano:
		OperDiv opD = new OperDiv();
		double resDiv = opD.oper(10, 0);
		System.out.println("Resultado NA: " +  resDiv);
		
		
		Calculando ssr = new Calculando();
		double ssrres = ssr.oper(2, 2);
		System.out.println("Calculando o resultado 2,2=" +  ssrres);  

		// ToDo - All Students Must Implement one Operation
		// - Oper0X - Name
		// Oper0X ope0X=new Oper0X();
		// double res0X = ope0X.oper(X, Y);
		// System.out.println(res0X);
	}

}
