/**
 * @author DPeltik
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 * @methods
 * <ol>
 * <li> static void hanoi(int amount, int  from, int to) ��������� ����� 
 * </ol>
 */
public class Hanoi {
/**
 * ����� �����
 * @param args ������ ��������� ����������
 */	
	public static void main(String[] args) {
		
		
		//hanoi(arg1, arg2, arg3);  //������ ������ ������, ��������� ���������
	    //������ main()

		hanoi(3,1,3);           //������ ������ ������ � �����������
								//����� ���������� ��� �������� ������� ������
								//��� �� �����������	
	}

	public static void hanoi(int amount, int  from, int to){
		int s=0;
		if (amount ==1) System.out.println("��������� � "+from+" �� "+to);
		else {
			s=6-from-to; 
			hanoi(amount-1, from,s);			
			System.out.println("��������� � "+from+" ��  "+to);
			hanoi(amount-1,s,to);
		}
	}	

}
