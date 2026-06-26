package java_program;

import java.util.Scanner;

public class P_07_Find_Area_of_Rectangle {

	 public static void main(String[] args) {
		 P_07_Find_Area_of_Rectangle obj=new P_07_Find_Area_of_Rectangle();
		 obj.m();
	 }
	
	 public void m() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter length and width to find the Area of Rectangle ");
		 int length=scan.nextInt();
		 int width=scan.nextInt();
		 
		 int area;
		 area=length*width;
		 System.out.println(length+" is length "+"and "+width+" is width"+" = "+area);
		 
	 }
}
