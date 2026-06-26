package java_program;

import java.util.Scanner;

public class P_05_Find_Area_of_circle {

	 public static void main(String[] args) {
		 P_05_Find_Area_of_circle obj=new P_05_Find_Area_of_circle();
		 obj.m(); 
	 }
	
	 public void m() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the radius of circle to find the Area of circle ");
		 int radius=scan.nextInt();
		 
		 float area;
		 area=3.14f*radius*radius;
		 System.out.println("Radius of circle is "+radius+" and area of circle is"+" = "+area);
		 
	 }
}
