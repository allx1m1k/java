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

		int[] values = {1, 0, 7, 1, -1, 5, 7}; //создадим массив
		//delDoubles(values); //вызов статического метода без создания объекта
		System.out.println(Arrays.toString(values));
		//System.out.println(isDouble(values, 0, 1));
		showDoubles(values);
		
	}
	
	//статический метод удаления дублей в массиве и приведения размерности массива 
	public static int[] showDoubles(int[] massiv){
		
		for(int i = 0; i < massiv.length; i++){ //итеративно берем i-ый элемент массива во внешнем цикле
			for (int j = i + 1; j < massiv.length; j++){
				//if (isDouble(massiv, i, j) == true) 
					System.out.println("значение для поииска дубля " + massiv[i] + " значение с которым проверям " + massiv[j] + " " + isDouble(massiv, i, massiv[j]));
				
			}
		}
			
				
		return massiv;
		
	}
	/**
	 * 	 
	 * @param massiv - масcив в котором ищем дубли
	 * @param index - индекс эелемента значение которого хотим проверить на дубли
	 * @param element - с чем проверяем
	 * @return
	 */
	public static boolean isDouble(int[] massiv, int index, int element) {
		
		if (element != massiv[index])  
			return false;
		else 
			return true;	
	}

}
