
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println ("Factorial calculation using recursion equals to:  " + factorial(8)); //recursion method
		//System.out.println ("Factorial calculation using recursion equals to: " + factorialEx(3)); //recursion method which throws Exception
		System.out.println ("Factorial calculation using iteration equals to: " + factorialIter(9)); //iteration method which throws Exception
			
	}
	
	/**Factorial calculation using recursion (method invokes himself)
	 * 
	 * @param f - positive integer as an method argument
	 * @return
	 */
	public static int factorial(int f){
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else {System.out.print("Negative argument in factorial function! "); return-1;}
	}
	/**Factorial calculation using recursion (method invokes himself) with Exception throws is an argument is negative
	 * 
	 * @param f - positive integer as an method argument
	 * @return
	 */
	public static int factorialEx(int f) throws IllegalArgumentException {
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else throw new IllegalArgumentException("Negative argument in factorial function! ");
	}
	/**Factorial calculation using iteration
	 * 
	 */
	public static int factorialIter(int f){
		int result=1;
		if(f==0) return 1; 
			if (f>0) {
				for (int i=1; i<=f; i++) 
					result = result*i;
				//return result;
			} else{System.out.print("Negative argument in factorial function! "); return-1;}
			return result;
			
	}


}
