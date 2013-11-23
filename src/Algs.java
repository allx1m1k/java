/**
 * @author ALesnevskiy
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
public class Hello {
/**
 * Точка входа
 * @param args массив строковых аргументов
 */
	public static void main(String[] args) {
		int operand1 = 40;
		int operand2 = 18;
//	int arg1=Integer.parseInt(args[0]);  //разбор агрументов метода main() 
//	int arg2=Integer.parseInt(args[1]);  //то же Необходимо задать все 3-и аргумента
//	int arg3=Integer.parseInt(args[2]);  //то же
	/*Вывод в консоль аргументов, для примера на стр. 169
	 * System.out.println(arg1);
	 * System.out.println(arg2);
	 * System.out.println(arg3); 
	 */
	
		//double arg1=Double.parseDouble(args[0]);

		

		
		//try{
		//	System.out.println(factorialEx( arg1));
		//}
		//catch (IllegalArgumentException e) {
		//	System.out.println (e.getMessage());
		//}
	
		System.out.println ("Факториал методом рекурсии равен: " + factorial(5)); //рекурсивный метод вычисления факториала
		
		System.out.println ("Наибольший общий делитель для oper1 " + operand1 + " и oper2 " + operand2 + " равен " + gcd(operand1,operand2));
		

//		System.out.println ("Факториал итерационным методом равен: " + factorial1(arg1)); //итерационный метод вычисления факториала
		//System.out.println (factorial1(5));
		
//		System.out.println("Фибоначчи рекурсия: " + fibonacci(arg1)); //рекурсивный метод чисел Фибоначчи
//		System.out.println("Фибоначчи итерация: " + fibonacci1(arg1)); //итерационный метод чисел Фибоначчи
		
		//System.out.println(summ(0.09));		//в метод summ() надо передавать
		//System.out.println(summ(arg2));	//аргументы от 0 до 1
		//System.out.println(summ(arg3));

			  
	/*double[][] m = new double[7][7]; //создание матрицы
	  for(int i=0; i<7; i++) // проход по строкам
	 	for(int j=0; j<7; j++) // проход по колонкам
	 		m[i][j]=Math.random(); // занесение в каждую ячейку произвольного значения
	 		double[] r = summVector(m); // занесение в массив суммы строки матрицы
	 									// метод summVector() как раз и рассчитывает
	 	for(int i=0; i<r.length; i++) System.out.println(r[i]);  //вывод в консоль
 	*/
	 
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
	
		/* Ниже пример использования статических методов класса Math
		 *  без создания объектов
		 */
		//double a = Math.PI; //присвоение
		//System.out.println(a); //вывод в консоль статической переменной
		//System.out.println(Math.round(a)+10); //к округленному a прибавляем 10
		//System.out.println(Math.E); //вывод в консоль статической переменной
		//System.out.println(Math.round(Math.E)); //округление до целого
		//System.out.println(Math.min(Math.E, Math.PI)); //вывод в консоль наименьшей из
		//статических переменных
		
	}
	public static int gcd( int m, int n){
		while(n!=0) 
			// n = m% (m=n);		
			n = m% (m=n);
			
		return m;
		
			
		
		
	}

	/**Рекурсивный метод вычисления фкториала (метод вызывает сам себя)
	 * 
	 * @param f - целое положительное число
	 * @return
	 */
	public static int factorial(int f){
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else {System.out.println("Отрицательный аргумент"); return-1;}
	}
	public static int factorialEx(int f) throws IllegalArgumentException {
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else throw new IllegalArgumentException("Negative argument in factorial function");
	}
	/** Итерационный метод вычисления факториала
	 * 
	 */
	public static int factorial1(int f){
		int result=1;
		if(f==0) return 1; 
			if (f>0) {
				for (int i=1; i<=f; i++) result = result*i;
				//return result;
			} else{System.out.println("Отрицательный аргумент"); return-1;}
			return result;
			
	}
	/**Рекурсивный метод вычисления чисел Фибоначчи
	 * 
	 */
	public static int fibonacci(int n){
		
		if(n<3) return 1; 
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static int fibonacci1(int n){
		int next=1, p1=1,p2=1;
		if (n<0) {
			 System.out.println("Отрицательный аргумент");
			 return -1;
		}
		if(n<3) return 1; 
		for (int i = 1;i<=n-2 ; i++) {
			next=p1+p2;
			p2=p1;
			p1=next;
		}
		return next;
	}
	public static double summ(double eps){
		double result=0.0, a=10;
		int i=1;
		while (a>eps){
			a=1.0/(i*i);
			i++;
			result=result+a;
		
		}
		System.out.println("возврат значения");
		return result;		
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
	
	/**Метод класса для изучения операций с массивами 
	 * (в ST - Array).
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
			for (int k=0; k<m[i].length; k++) { //цикл по колонкам 
				sum = sum + m[i][k];				
			}
			System.out.println("Сумма элементов массива =" + sum);
	}
	/**Метод класса для изучения операций с массивами 
	 * (в ST - Array).
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

}
