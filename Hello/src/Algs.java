/**
 * @author ALesnevskiy
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 * @methods
 * <ol>
 * <li> 
 * <li> 
 * <li> 
 * </ol>
 */
public class Algs {
/**
 * Точка входа
 * @param args массив строковых аргументов
 */
	public static void main(String[] args) {
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



		
//		System.out.println("Фибоначчи рекурсия: " + fibonacci(arg1)); //рекурсивный метод чисел Фибоначчи
//		System.out.println("Фибоначчи итерация: " + fibonacci1(arg1)); //итерационный метод чисел Фибоначчи
		
		//System.out.println(summ(0.09));		//в метод summ() надо передавать
		//System.out.println(summ(arg2));	//аргументы от 0 до 1
		//System.out.println(summ(arg3));

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


}
