package studio1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year y: ");
		int y = in.nextInt();
		boolean leapYear =((y%4==0)&&(y%100!=0))||(y%400==0);
		System.out.println(y+" is a leap year "+leapYear);

	}

}
