package java_program;

import java.util.Scanner;

public class P_09_Find_no_greatest_smallest {

	public static void main(String[] args) {
		P_09_Find_no_greatest_smallest obj=new P_09_Find_no_greatest_smallest ();
		obj.m();
		obj.m1();
	}
	
	public void m() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three number to find greater");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a>b &&a>c) {
			System.out.println(a+" : is greater");
		}
		else if(b>a &&b>c) {
			System.out.println(b+" : is greater");
		}
		else  {
			System.out.println(c+" : is greater");
		}
		
	}
	
	public void m1() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three number to find small number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a<b &&a<c) {
			System.out.println(a+" : Number is smaller");
		}
		else if(b<a &&b<c) {
			System.out.println(b+" : Number is smaller");
		}
		else  {
			System.out.println(c+" : Number is smaller");
		}
		
	}
}
