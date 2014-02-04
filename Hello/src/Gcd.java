/**
 * @author dima 20140204
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 * @methods
 * <ol>
 * <li> gcd(int m, int n) calculates the greatest common divisor for two operands
 * </ol>
 */
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operand1 = 10;
		int operand2 = 90;

		System.out.println ("The gratest common devisor for oper1 " + operand1 + " and oper2 " + operand2 + " quals to " + gcd(operand1,operand2));
	}
	
	public static int gcd( int m, int n)	{
		while(n!=0) 
			// n = m% (m=n);		
			n = m% (m=n);
		return m;		
	}
	

}
