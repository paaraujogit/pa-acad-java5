/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.calc;

/**
 *
 * @author El Rudras
 */
public class Most_Useless_Operation_Ever {
    public class OperEx implements ItfOper {

	@Override
	public double oper(double op1, double op2) {
		return op1+2*op2;
	
        }
    }
}
