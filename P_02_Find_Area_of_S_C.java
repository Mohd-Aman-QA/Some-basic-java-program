package java_program;

import java.util.Scanner;

public class P_02_Find_Area_of_S_C {

	public static void main(String[] args) {
		P_02_Find_Area_of_S_C obj= new P_02_Find_Area_of_S_C ();
		obj.FindAreaOfSquare();
		obj.FindAreaOfCube();
	}
	
	 public void FindAreaOfSquare() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the side to find area of square");
		 int side=scan.nextInt();
		 
		 int area;
		area=side*side;
		 System.out.println(side+" Area of square is:"+area);
		 
	 }
	 
	 public void FindAreaOfCube() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the side to find area of cube");
		 int side=scan.nextInt();
		 
		 int area;
		area=side*side*side;
		 System.out.println(side+" Area of Cube is:"+area);
	 }
}
