package solutionjavabasics1;

public class SolutionJavaBasics1 {
	
	/*
	  Question 1: 
			Write a Java code to print "Welcome to The India" on the console and then print your name on a separate line. 
	  Arguments: 
			No Arguments 
	  Expected return value: 
	  		No return value 
	  Sample Input: 
			No input 
	  Sample Output: 
			Welcome to The India 
			My name is: XXX
	 */
	
	public static void displayMessage() {
		System.out.println("Welcome to The India\nMy name is: XXX");
	}
	
	/*
		Question 2: 
			Write a Java code to print a face. 
		Arguments: 
	  		No Arguments 
		Expected return value: 
			No return value 
		Sample Input: 
	  		No input 
		Sample Output: 
			+"""""+                                                 
		       [| o o |]                                                
			|  ^  |                                                 
			| '-' |                                                 
	       `	+-----+
	 */
	
	public static void printFace() {
		System.out.println(" +\"\"\"\"\"+ ");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  |");
		System.out.println(" | '-' |");
		System.out.println(" +-----+");
	}
	
	/*
		Question 3: 
			Write a Java code to check whether Java is installed on your computer. 
		Arguments: 
	  		No Arguments 
		Expected return value:
			No return value 
		Sample Input: 
	  		No input 
		Sample Output: 
	  		Java Version: 1.8.0_71                                                            
	  		Java Runtime Version: 1.8.0_71-b15                                                
	  		Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
	  		Java Vendor: Oracle Corporation                                                   
	  		Java Vendor URL: http://Java.oracle.com/                                          
	  		Java Class Path: .
	 */
	
	public static void checkJavaInstalled() {
		System.out.println("\nJava Version: " + System.getProperty("java.version"));
		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");

	}
	
	/*
		Question 4: 
			Write a Java code to Multiply Two Floating-Point Numbers
      		Arguments: 
	  		float number1 : first floating point number 
	      		float number2 : second floating point number
	  	Expected return value :
	     		float : product of number1 and number2
	  	Sample Input : 2.0f, 5.0f
	    	Sample Return Value : 10.0f
    	*/
	
	public static float multiplyFloatingNumbers(float number1, float number2) {
		float number3 = number1 * number2;
		return number3;
	}
	
	/*
 		Question 5: 
			Write a Java code to calculate simple interest.
  		Formula : 
  			simpleinterset = ( principal * time * rate) / 100;
  		Arguments: 
			int principal : principal value
			int time : time value
			int rate : rate value
  		Expected return value: 
  			int :  calculated simple interest value
  		Sample Input: 10000, 5, 5
  		Sample Output: 2500
	 */
 
	public static int simpleInterest(int principal, int time, int rate) {
		int simpleInterestValue = (principal * time * rate) / 100;
		return simpleInterestValue;
	}
	
	
	/*
		Question 6: 
			Write a Java code to print the result of the following operations. 
		Arguments: 
			No Arguments 
		Expected return value : 
	    		int : Result of the evaluated expression
		Sample Input : No input 
		Sample Return Value : 13
   
	 */
	
	public static int expression() {
		int number = 5 + 15 / 3 * 2 - 8 % 3;
		return number;
	}
	
	/*
		Question 7: 
			Write a Java code to print the area of a circle. 
		Arguments: 
			 double radius : radius of the circle
		Expected return value : 
	    		double : Calculate the area of the circle
		Sample Input : 7.5 
		Sample Return Value : 176.71458676442586 
	 */
	
	public static double areaCircle(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}

	/*
		Question 8: 
	 		Write a Java code to convert temperature from Fahrenheit to Celsius degree.
        	Formula:
        		celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        	Arguments: 
			 double fahrenheit : the fahrenheit value to be converted
		Expected return value : 
	    		double : the Celsius value after conversion
		Sample Input : 212 
		Sample Return Value : 100.0          
	 */
	
	public static double fahrenheittoCelsius(double fahrenheit) {
		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		return celsius;
	}
	
	/*
		Question 9: 
			Write a Java code that reads a number in inches, converts it to meters.
        	Note: One inch is 0.0254 meter.
 	`	Arguments: 
			double inch : the inch value to be converted 
		Expected return value : 
	    		double : the meter value after conversion
		Sample Input : 1000 
		Sample Return Value : 25.4 
	 */

	public static double convertInchtoMeter(double inch) {
		double meter = inch * 0.0254;
		return meter;
	}
	
	/*
		Question 10: 
			A pen costs 50$ and it is been sold at a discount of 12%, what is the discount price of the pen?
		Arguments: 
			int price : price of the pen
			int discount : discount of the pen
		Expected return value: 
			float : The calculated discount price of the pen
		Sample Input:  50, 12
		Sample Output: 6
	*/

	public static float penDiscount(int price, int discount) {
		int discountPrice = (price * discount) / 100 ;
		return discountPrice;
	}

	/*
		Question 11: 
			Write a Java code to Compute Quotient of a number.
		Arguments: 
			int dividend : dividend value
			int divisor : divisor value
		Expected return value: 
			int : quotient value
		Sample Input: 20, 10 
		Sample Output:  2
	*/
	
	public static int quotientValue(int dividend, int divisor) {
	int quotient = dividend / divisor;
	return quotient;			
	}
	
	/*
		Question 12: 
			Write a Java code to Find ASCII Value of a character.
		Arguments: 
			char character : character value
		Expected return value: 
			int : calculated ASCII value
		Sample Input: a 
		Sample Output: 97
	 */

	public static int asciiValue(char character) {
		int value = (int) character;
		return value;
	}

	/*
		Question 13: 
			Write a java code to assign a value of 100.235 to a double variable and then convert it to int.
		Arguments: 
			double number : double value to be convert
		Expected return value: 
			int : The converted double value into an integer
		Sample Input:  100.235 
		Sample Output: 100
		*/	

	public static int conversion(double number) {
		int output = (int) (number);
		return output;
	}
	
	/*
		Question 14: 
			Write a java code to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		Arguments: 
			int number : integer number i.e., 3
			char l : character value i.e., 'd'
		Expected return value: 
			char : The calculated ASCII character, the sum of 3 and 'd'
		Sample Input: 3, 'd' 
		Sample Output: g
	*/	

	public static char addNumberAndCharacter(int number, char l) {
		int result = number + l;
		return (char)result;
	}
	
	/*
		Question 15: 
			Write a Java code that takes three numbers as input to calculate and print the average of the numbers.			
		Arguments: 
		int number1 : integer number1
		int number2 : integer number2
		int number3 : integer number3
		Expected return value: 
		double : The calculated value is an average of three integer numbers    
		Sample Input:  4, 5, 2
		Sample Output: 3.6666666666666665
	*/	
		
	public static double average(int number1, int number2, int number3) {
		double average =  (double) (number1 + number2 + number3) / 3;
		return average;
	}
}
