package pa.calc;
/**
 *
 * @author Nuno
 */
public class Oper_NA implements ItfOper{
    	@Override
	/*Quadrado da soma de dois numeros*/
        public double oper(double op1, double op2) {
		return (op1+op2)*(op1+op2);
	}
}
