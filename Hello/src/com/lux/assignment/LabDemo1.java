/**
*@author dima
* ����� LabDemo ��������������� ������ ������ Date
*
*
*/

import com.lux.assignment.Date1;
import java.io.*;
import java.lang.*;
import java.util.Arrays;

public class LabDemo1 {

public static void main(String[] args) {
	//�������� ������ � ������� ������������ ��-���������
	Date1 date1 = new com.lux.assignment.Date1();
	Date1 date2 = new Date1(1, 6, 1976);
	Date1 date3 = new Date1(date2);
	Date1 date4 = new Date1(9,9,2013);
	date1.printDate();
	date2.printDate();
	date3.printDate();
	System.out.print("Date4 is: ");
	date4.printDate();
	//�������� ����
	date4.incDay(10);
	System.out.print("Changed date4 is: ");
	date4.printDate();
	System.out.print(Date1.compareDates(date4, date3));
	}

}