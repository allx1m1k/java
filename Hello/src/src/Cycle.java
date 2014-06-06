/**
 * @author dima
 * <h1>Cycles</h1>
 * 
 * Learning while()
 * Learning fro ()
 * 
 * Lesnevsky p.165-166
 */
public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("The latest value of temp is " +  conditionalPrinting());
		System.out.println();
		parametricPrinting(15);
		/*
		System.out.println("The randomized value = " +  anyValue);
		System.out.println("The randomized value multiplied on 10 = " +  10 * Math.random());
		*/
	}
/**
 * Send evaluated randomized variable to console until value of it more than 5
 * @param no arguments;
 * @return the latest value of temp varible;
 */
	public static double conditionalPrinting () {
		double temp = 10.0; //initializing temp variable
		System.out.println("Initial value of temp is = " +  temp);
		
		while (temp > 5) {
			temp = Math.random(); //assignment to variable any random value
			temp = temp * 10; //change value temp
			System.out.println("The randomized value multiplied on 10 = " +  temp);				
		}	
		return temp;
	}
	
	/**
	 * 
	 * @param int i boundary value for printnig;
	 * @return int;
	 */
	public static int parametricPrinting (int i) {
		for (int index = 0; index <= i; index++) {
			System.out.println("Index is " +  index);		
		}
		return 0;
		
	}
	
}

