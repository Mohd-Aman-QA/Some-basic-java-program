package java_program;

import java.util.Scanner;

public class P_10_Find_Simple_Intrest {

	public static void main(String []args) {
		P_10_Find_Simple_Intrest  obj= new P_10_Find_Simple_Intrest ();
		obj.m();
	}
	
	public void m() {
		  Scanner scan= new Scanner(System.in);
			System.out.println("enter Amount");
			double Amount=scan.nextDouble();
			System.out.println("enter rate (in %)");
			double rate=scan.nextDouble();
			System.out.println("enter time (in year)");
			double time=scan.nextDouble();
			
			double si;
			si=Amount*rate* time/100;
			
			System.out.println("Principle is :"+Amount);
			System.out.println("Rate is :"+rate);
			System.out.println("Time is :"+time);
			System.out.println("Simple Intrest is :"+si);
			System.out.println("Total Amount of (si) is :"+(Amount+si));
			
	}
}
