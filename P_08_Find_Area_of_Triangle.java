package java_program;

import java.util.Scanner;

public class P_08_Find_Area_of_Triangle {

	
	 public static void main(String[] args) {
		 P_08_Find_Area_of_Triangle obj=new P_08_Find_Area_of_Triangle();
		 obj.m();
	 }
	
	 public void m() {
		 Scanner scan=new Scanner(System.in);
		
		 System.out.println("Enter height and base to find the Area of Triangle ");
		 int height=scan.nextInt();
		 int base=scan.nextInt();
		 
		 float area;
		 area=0.5f*height*base;
		 System.out.println(height+" is height "+"and "+base+" is base"+" = "+area);
		 
	 }
}
