/**
 * 
 * @author dima 20140204
 * This demo class shows concepts of "hiding" in Java for temporary variables which named the same in different blocks
 * Also see Lesnevsky book p.161
 */
public class TempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 0;
		System.out.println("Varible k from main method= "+ k );
		doSomething(k);
	}
	
	public static int doSomething(int m) {
		{
		int k = 1;
		System.out.println("Varible k from class method and first block= "+ k ); //first block
		}
		
		for (int i =1; i<5; i++) {
			int k = 5;
			System.out.println("Varible k from class method and second block= "+ k ); //second block
		}
		
		return 0;
	
	}

}
