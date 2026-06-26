package java_program;

import java.util.Scanner;

public class P_06_Find_area_of_circumference {

	public static void main(String []args) {
		P_06_Find_area_of_circumference obj=new P_06_Find_area_of_circumference();
		obj.m();
	}
	public void m() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius to find area of circumfrence");
		double radius=scan.nextFloat();
		
		double Circumfrence;
		Circumfrence=2*3.14*radius;
		
		System.out.println(radius+" is radius"+" and Area of Circumfrence is :"+Circumfrence);
	}
}
