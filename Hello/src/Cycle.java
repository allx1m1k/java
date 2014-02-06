/*
 * Learning while()
 * Lesnevsky p.165
 */
public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("The latest value of temp is " +  conditionalprinting());
		/*
		System.out.println("The randomized value = " +  anyValue);
		System.out.println("The randomized value multiplied on 10 = " +  10 * Math.random());
		*/
	}
/**
 * 
 * @param i incoming argument 
 */
	public static double conditionalprinting () {
		double temp = 10.0; //initializing temp variable
		System.out.println("Initial value of temp is = " +  temp);
		
		while (temp > 5) {
			temp = Math.random(); //assignment to variable any random value
			temp = temp * 10; //change value fro temp
			System.out.println("The randomized value multiplied on 10 = " +  temp);
								
		}
		
		
		return temp;
		
	}
	
}

