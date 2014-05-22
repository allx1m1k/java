/**
 * @author allx1m1k
 * 
 *Найти и удалить/отобразить дубликаты из заданного массива целых чисел
 *	
 */
package com.lux.assignment;

import java.util.Arrays;




public class DelArrayDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {1, 0, 7, 1, -1, 5, 7, 7}; //создадим массив
		//delDoubles(values); //вызов статического метода без создания объекта
		System.out.println(Arrays.toString(values));
		//System.out.println(isDouble(values, 0, 1));
		showDoubles(values);
		
	}
	
	//статический метод отображения дублей в массиве и приведения размерности массива 
	public static int[] showDoubles(int[] massiv){
		
		for(int i = 0; i < massiv.length; i++){ //итеративно берем i-ый элемент массива во внешнем цикле
			for (int j = 0; j < massiv.length; j++){
				//if (isDouble(massiv, i, j) == true) 
					System.out.println("значение для поииска дубля " + massiv[i] + " значение с которым проверям " + massiv[j] + " " + isDouble(massiv, i, massiv[j], j));
				
			}
		}		
		return massiv;
		
	}
	/**
	 * 	 
	 * @param massiv - масcив в котором ищем дубли
	 * @param indexToCheck - индекс эелемента значение которого хотим проверить на дубли
	 * @param element - с чем проверяем
	 * @param elementIndex - индекс эелемента с которым проверяем
	 * @return
	 */
	public static boolean isDouble(int[] massiv, int indexToCheck, int element, int elementIndex) {
			
		if (element != massiv[indexToCheck] & indexToCheck != elementIndex)  
			return false;
		else 
			return true;
			
	}

}
