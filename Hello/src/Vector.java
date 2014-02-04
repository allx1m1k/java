/**
 * @author dima 20140204
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 * @methods
 * <ol>
 * <li> myVector(int m[][]) вычисляет сумму всех элементов массива.
 * <li> myVectorDig(int m[][]) вычисляет сумму элементов массива по диагонали.
 * <li> summVector(double [][] matrix) возвращает массив, каждый элемент которого, сумма строки двумерного массива-аргумента.
 * </ol>
 */
public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double[][] m = new double[7][7]; //создание матрицы
			for(int i=0; i<7; i++) // проход по строкам
				for(int j=0; j<7; j++) // проход по колонкам
					m[i][j]=Math.random(); // занесение в каждую ячейку произвольного значения
			
			//double[] r = summVector(m); // занесение в массив суммы строки матрицы
									// метод summVector() как раз и рассчитывает
			

			//for(int i=0; i<m.length; i++) System.out.println(m[i]);  //вывод в консоль


/**Заполнеие массива значениями
* строка 0 заполняется единицами
* строка 1 заполняется двойками
* строка 2 заполняется тройками, т.к.
* при выходе из внутреннего цикла, переменная z не изменяется**/
/*		
int[][] m = new int [3][3]; //создание 2-у мерного массива (матрицы) m
int z=1; //инициализация переменной
for (int x=0; x < 3; x++) { //первый проход - выбор строки
	for (int y=0; y < m[x].length; y++) //второй проход - выбор колонки
		m[x][y] = z ;					
		z = z+1;
}

myPrint(m);
myVector(m); //вызов метода подсчета суммы всех элементов массива
myVectorDig(m); //вызов метода подсчета суммы всех элементов массива по диагонали
*/	
	}
	
	/**
	 * Метод печати массива 
	 * @param m массив
	 */
	public static void myPrint (int [][] m) {
		System.out.println(m[0][0]);
		System.out.println(m[0][1]);
		System.out.println(m[0][2]);
		System.out.println(m[1][0]);
		System.out.println(m[1][2]);
		System.out.println(m[2][2]);
	}
	public static double[] summVector(double [][] matrix){
	double[] result=new double[matrix.length];
	
		for(int i=0;i<matrix.length;i++){
			double s=0;
			for(int j=0;j<matrix[i].length;j++)
				s=s+matrix[i][j];
			result[i]=s;
		}
		return result;
	}
	
	/**This is method for class Vector. The main purpose is learn operation with matrix in Java 
	 * (similiar class in Small Talk - Array).
	 * Выполняет вычисление суммы всех элементов двумерной матрицы.
	 * Ничего не возвращает 
	 * @param m - двумерный массив
	 */
	public static void myVector (int [][] m) {
		System.out.println("Двумерный массив, ссылка на него:" + m); // вывод матрицы (ссылки) на экран 
		System.out.println("Первый элемент 0,0:" + m[0][0]); //вывод элемента матрицы на экран
		System.out.println("Размер массива =" + m.length); //вывод длины матрицы на экран
		int sum = 0;
		for (int i=0; i<m.length; i++) // цикл по строкам 
			for (int k=0; k<m[i].length; k++)	{ 
				//цикл по колонкам 
				sum = sum + m[i][k];				
			}
			System.out.println("Сумма элементов массива =" + sum);
	}
	/**This is method for class Vector. The main purpose is learn operation with matrix in Java 
	 * (similiar class in Small Talk - Array).
	 * Выполняет вычисление суммы по диагонали элементов двумерной матрицы.
	 * Ничего не возвращает
	 * @param m - двумерный массив
	 */
	public static void myVectorDig (int [][] m) {
		int sum = 0;
		for (int i=0; i<m.length; i++) // цикл по строкам
			for (int k=0; k<m[i].length; k++) //цикл по колонкам
				if (i==k) sum = sum + m[i][k];
		System.out.println("Сумма элементов массива по диагонали с лева на право  =" + sum);
	}


}
