/**
 * @author ALesnevskiy
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 * @methods
 * <ol>
 * <li> myVector(int m[][]) ��������� ����� ���� ��������� �������.
 * <li> myVectorDig(int m[][]) ��������� ����� ��������� ������� �� ���������.
 * <li> summVector(double [][] matrix) ���������� ������, ������ ������� ��������, ����� ������ ���������� �������-���������.
 * </ol>
 */
public class Hello {
/**
 * ����� �����
 * @param args ������ ��������� ����������
 */
	public static void main(String[] args) {
		int operand1 = 40;
		int operand2 = 18;
//	int arg1=Integer.parseInt(args[0]);  //������ ���������� ������ main() 
//	int arg2=Integer.parseInt(args[1]);  //�� �� ���������� ������ ��� 3-� ���������
//	int arg3=Integer.parseInt(args[2]);  //�� ��
	/*����� � ������� ����������, ��� ������� �� ���. 169
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
	
		System.out.println ("��������� ������� �������� �����: " + factorial(5)); //����������� ����� ���������� ����������
		
		System.out.println ("���������� ����� �������� ��� oper1 " + operand1 + " � oper2 " + operand2 + " ����� " + gcd(operand1,operand2));
		

//		System.out.println ("��������� ������������ ������� �����: " + factorial1(arg1)); //������������ ����� ���������� ����������
		//System.out.println (factorial1(5));
		
//		System.out.println("��������� ��������: " + fibonacci(arg1)); //����������� ����� ����� ���������
//		System.out.println("��������� ��������: " + fibonacci1(arg1)); //������������ ����� ����� ���������
		
		//System.out.println(summ(0.09));		//� ����� summ() ���� ����������
		//System.out.println(summ(arg2));	//��������� �� 0 �� 1
		//System.out.println(summ(arg3));

			  
	/*double[][] m = new double[7][7]; //�������� �������
	  for(int i=0; i<7; i++) // ������ �� �������
	 	for(int j=0; j<7; j++) // ������ �� ��������
	 		m[i][j]=Math.random(); // ��������� � ������ ������ ������������� ��������
	 		double[] r = summVector(m); // ��������� � ������ ����� ������ �������
	 									// ����� summVector() ��� ��� � ������������
	 	for(int i=0; i<r.length; i++) System.out.println(r[i]);  //����� � �������
 	*/
	 
	/**��������� ������� ����������
	 * ������ 0 ����������� ���������
	 * ������ 1 ����������� ��������
	 * ������ 2 ����������� ��������, �.�.
	 * ��� ������ �� ����������� �����, ���������� z �� ����������**/
/*		
	int[][] m = new int [3][3]; //�������� 2-� ������� ������� (�������) m
	int z=1; //������������� ����������
	for (int x=0; x < 3; x++) { //������ ������ - ����� ������
		for (int y=0; y < m[x].length; y++) //������ ������ - ����� �������
			m[x][y] = z ;					
			z = z+1;
	}

	myPrint(m);
	myVector(m); //����� ������ �������� ����� ���� ��������� �������
	myVectorDig(m); //����� ������ �������� ����� ���� ��������� ������� �� ���������
*/	
	
		/* ���� ������ ������������� ����������� ������� ������ Math
		 *  ��� �������� ��������
		 */
		//double a = Math.PI; //����������
		//System.out.println(a); //����� � ������� ����������� ����������
		//System.out.println(Math.round(a)+10); //� ������������ a ���������� 10
		//System.out.println(Math.E); //����� � ������� ����������� ����������
		//System.out.println(Math.round(Math.E)); //���������� �� ������
		//System.out.println(Math.min(Math.E, Math.PI)); //����� � ������� ���������� ��
		//����������� ����������
		
	}
	public static int gcd( int m, int n){
		while(n!=0) 
			// n = m% (m=n);		
			n = m% (m=n);
			
		return m;
		
			
		
		
	}

	/**����������� ����� ���������� ��������� (����� �������� ��� ����)
	 * 
	 * @param f - ����� ������������� �����
	 * @return
	 */
	public static int factorial(int f){
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else {System.out.println("������������� ��������"); return-1;}
	}
	public static int factorialEx(int f) throws IllegalArgumentException {
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else throw new IllegalArgumentException("Negative argument in factorial function");
	}
	/** ������������ ����� ���������� ����������
	 * 
	 */
	public static int factorial1(int f){
		int result=1;
		if(f==0) return 1; 
			if (f>0) {
				for (int i=1; i<=f; i++) result = result*i;
				//return result;
			} else{System.out.println("������������� ��������"); return-1;}
			return result;
			
	}
	/**����������� ����� ���������� ����� ���������
	 * 
	 */
	public static int fibonacci(int n){
		
		if(n<3) return 1; 
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static int fibonacci1(int n){
		int next=1, p1=1,p2=1;
		if (n<0) {
			 System.out.println("������������� ��������");
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
		System.out.println("������� ��������");
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
	
	/**����� ������ ��� �������� �������� � ��������� 
	 * (� ST - Array).
	 * ��������� ���������� ����� ���� ��������� ��������� �������.
	 * ������ �� ���������� 
	 * @param m - ��������� ������
	 */
	public static void myVector (int [][] m) {
		System.out.println("��������� ������, ������ �� ����:" + m); // ����� ������� (������) �� ����� 
		System.out.println("������ ������� 0,0:" + m[0][0]); //����� �������� ������� �� �����
		System.out.println("������ ������� =" + m.length); //����� ����� ������� �� �����
		int sum = 0;
		for (int i=0; i<m.length; i++) // ���� �� ������� 
			for (int k=0; k<m[i].length; k++) { //���� �� �������� 
				sum = sum + m[i][k];				
			}
			System.out.println("����� ��������� ������� =" + sum);
	}
	/**����� ������ ��� �������� �������� � ��������� 
	 * (� ST - Array).
	 * ��������� ���������� ����� �� ��������� ��������� ��������� �������.
	 * ������ �� ����������
	 * @param m - ��������� ������
	 */
	public static void myVectorDig (int [][] m) {
		int sum = 0;
		for (int i=0; i<m.length; i++) // ���� �� �������
			for (int k=0; k<m[i].length; k++) //���� �� ��������
				if (i==k) sum = sum + m[i][k];
		System.out.println("����� ��������� ������� �� ��������� � ���� �� �����  =" + sum);
	}
	
	/**
	 * ����� ������ ������� 
	 * @param m ������
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
