/**
 * @author allx1m1k
 * 
 *Найти и удалить дубликаты из заданного массива целых чисел
 *	
 */
package com.lux.assignment;

import java.util.Arrays;




public class DelArrayDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {1, 0, 7, 1, -1, 5, 7}; //создадим массив
		delDoubles(values);
	}
	
	
	public static int[] delDoubles(int[] i){
		
		System.out.println(Arrays.toString(i));
		return i;
		
	}

}
