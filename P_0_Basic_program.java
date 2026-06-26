package java_program;

public class P_0_Basic_program {

	 public static void main(String[] args) {
		 addition_of_two_numbers();
		 subtraction_of_two_numbers();
		 multiplication_of_two_numbers();
		 division_of_two_numbers();
	 }
	 
	 public static void addition_of_two_numbers() {
		 int number1=2;
		 int number2=5;
		 int additionresult;
		 
		 additionresult=number1+number2;
		 
		 System.out.println("addition of "+number1+" and "+number2+" is "+additionresult);
	 }
	 
      public static void subtraction_of_two_numbers() {
    		 int number1=5;
    		 int number2=9;
    		 int subtractionresult;
    		 
    		 subtractionresult=number1-number2;
    		 
    		 System.out.println("subtraction of "+number1+" and "+number2+" is "+subtractionresult);
	 }
 
     public static void multiplication_of_two_numbers() {
    	 int number1=5;
		 int number2=9;
		 int multiplicationresult;
		 
		 multiplicationresult=number1*number2;
		 
		 System.out.println("multiplication of "+number1+" and "+number2+" is "+multiplicationresult);
 }
 
     public static void division_of_two_numbers() {
    	 int number1=2;
		 int number2=6;
		 int quotient;
		 int remainder;
		 quotient=number1/number2;
		 remainder=number1%number2;
		 
		 System.out.println("quotient of "+number1+" and "+number2+" is "+quotient);
		 System.out.println("remainder of "+number1+" and "+number2+" is "+ remainder);
 }
}
