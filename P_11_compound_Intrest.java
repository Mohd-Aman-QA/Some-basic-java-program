package java_program;

import java.util.Scanner;

public class P_11_compound_Intrest {

	public static void main(String []args) {
		P_11_compound_Intrest  obj= new P_11_compound_Intrest ();
		obj.m();
	}
	
	public void m() {
		 Scanner scan= new Scanner(System.in);
			System.out.println("enter principle");
			double principle=scan.nextDouble();
			System.out.println("enter rate (in %)");
			double rate=scan.nextDouble();
			System.out.println("enter time (in year)");
			double time=scan.nextDouble();
			
			double ci;
			ci=principle*Math.pow(1+rate/100,time)-principle;
			
			System.out.println("Principle is :"+principle);
			System.out.println("Rate is :"+rate);
			System.out.println("Time is :"+time);
			System.out.println("Compound Intrest is :"+ci);
			System.out.println("Total Amount is :"+(principle+ci));
			
	}
}
