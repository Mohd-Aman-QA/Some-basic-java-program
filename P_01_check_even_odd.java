package java_program;

import java.util.Scanner;

public class P_01_check_even_odd {


	 public static void main(String []args) {
		 P_01_check_even_odd obj=new P_01_check_even_odd();
		 obj.m();
	 }
	 
	 public void m() {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Enter the number to check even or odd");
		 int a=scan.nextInt();
		 
		 if(a%2==0) {
			 System.out.println(a+" number is even");
		 }
		 else {
			 System.out.println(a+" number is odd");
		 }
	 }
}
