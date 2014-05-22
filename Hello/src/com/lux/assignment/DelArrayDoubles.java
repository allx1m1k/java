/**
 * @author allx1m1k
 * 
 *Ќайти и удалить/отобразить дубликаты из заданного массива целых чисел
 *	
 */
package com.lux.assignment;

import java.util.Arrays;




public class DelArrayDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {1, 0, 7, 1, -1, 5, 7}; //создадим массив
		//delDoubles(values); //вызов статического метода без создани€ объекта
		System.out.println(Arrays.toString(values));
		//System.out.println(isDouble(values, 0, 1));
		showDoubles(values);
		
	}
	
	//статический метод удалени€ дублей в массиве и приведени€ размерности массива 
	public static int[] showDoubles(int[] massiv){
		
		for(int i = 0; i < massiv.length; i++){ //итеративно берем i-ый элемент массива во внешнем цикле
			for (int j = 0; j < massiv.length; j++){
				//if (isDouble(massiv, i, j) == true) 
					System.out.println("значение дл€ поииска дубл€ " + massiv[i] + " значение с которым провер€м " + massiv[j] + " " + isDouble(massiv, i, massiv[j], j));
				
			}
		}		
		return massiv;
		
	}
	/**
	 * “ут нужен цикл потому что мы выдергиваем один элемент и массива и его сравниваем со _всеми_ остальными элементами!	 
	 * @param massiv - масcив в котором ищем дубли
	 * @param indexToCheck - индекс эелемента значение которого хотим проверить на дубли
	 * @param element - с чем провер€ем
	 * @param elementIndex - индекс эелемента с которым провер€ем
	 * @return
	 */
	public static boolean isDouble(int[] massiv, int indexToCheck, int element, int elementIndex) {
			
		if (element != massiv[indexToCheck] & indexToCheck != (elementIndex - 1))  
			return false;
		else 
			return true;
			
	}

}
