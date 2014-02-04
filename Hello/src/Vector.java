/**
 * @author dima 20140204
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
public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double[][] m = new double[7][7]; //�������� �������
			for(int i=0; i<7; i++) // ������ �� �������
				for(int j=0; j<7; j++) // ������ �� ��������
					m[i][j]=Math.random(); // ��������� � ������ ������ ������������� ��������
			
			//double[] r = summVector(m); // ��������� � ������ ����� ������ �������
									// ����� summVector() ��� ��� � ������������
			

			//for(int i=0; i<m.length; i++) System.out.println(m[i]);  //����� � �������


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
			for (int k=0; k<m[i].length; k++)	{ 
				//���� �� �������� 
				sum = sum + m[i][k];				
			}
			System.out.println("����� ��������� ������� =" + sum);
	}
	/**This is method for class Vector. The main purpose is learn operation with matrix in Java 
	 * (similiar class in Small Talk - Array).
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


}
