package com.example.exercises;
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
		TempVar newVar = new TempVar();
		newVar.doSomething(k);
	}
	
	/**
	 * @author dima 20140510
	 * @param m - input int for this method
	 * @return k - output int this is sum of input and iterator
	 */
	public int doSomething(int m) {
		int k = m;
		{
		k = k + 1;
		System.out.println("Varible k from method and first block= "+ k ); //first block
		}
		
		for (int i =1; i<5; i++)
		{
			k = k + i;
			System.out.println("Varible k from method and second block= "+ k ); //second block
		}
		return k;
		
	}
	
}
