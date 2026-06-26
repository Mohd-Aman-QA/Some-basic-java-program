package java_program;

import java.util.Scanner;

public class P_04_Find_percentage {

	public static void main(String []args) {
		P_04_Find_percentage obj= new P_04_Find_percentage();
		obj.m();
	}
	
	public void m() {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the score ");
		double scor=scan.nextDouble();
		System.out.println("enter the totalmarks ");
		double totalmarks=scan.nextDouble();
		
		double percentage;
		percentage =scor/totalmarks*100;
		
		System.out.println(scor+" of "+totalmarks+" percent is ="+percentage+"%");
		
	}
}
