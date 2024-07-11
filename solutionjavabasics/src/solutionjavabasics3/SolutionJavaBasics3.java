package solutionjavabasics3;

public class SolutionJavaBasics3 {

	/*
		Question 26: 
			Write a Java code to display 'n' natural numbers.
		Arguments: 
			int number: natural numbers to be display 
		Expected return value: 
			int : The natural numbers
		Sample Input:  5
		Sample Output: 1
					   2
				   	   3
					   4
					   5		 
	 */

	public static void naturalNumbers(int number) {
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}	
	}
	
	/*
		Question 27: 
			Write a Java code sum of 'n' natural Number.
			        1 + 2 + 3 + 4 + 5.......n
		Arguments: 
			int number : numbers to be sum upto given an integer
		Expected return value: 
			int : The summed natural numbers
		Sample Input: 5 
		Sample Output: 15	 
	 */
	
	public static int sumofNaturalNumber(int number) {
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	/*
		Question 28: 
			Write a Java code to Count Number of Digits in an Integer number.
		Arguments: 
			int number : number to be count
		Expected return value: 
			int : The counted number of digits in a number
		Sample Input: 256 
		Sample Output: 3	 
	 */
	
	public static int countDigits(int number) {
		int count = 0;
		while(number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}
	
	/*
		Question 29: 
			Write a java code to find the value of one number raised to the power of another (Do not use Java built-in method).
		Arguments: 
			int number : number value
			int power : power value
		Expected return value: 
			int : The calculated power of a number
		Sample Input: 2,5 
		Sample Output: 	32	 
	 */
	
	public static int powerofNumber(int number, int power) {
		int output = 1;
		while(power != 0) {
			output = output * number;
			power--;
		}
		return output;	
	}
	
	/*
		Question 30: 
			Write a Java code to calculate highest common factor(HCF).
		Arguments:
			int number1 : integer number1
			int number2 : integer number2
		Expected return value: 
			int : the calculated HCF value
		Sample Input: 4, 8  
		Sample Output: 4
	 	Example
			4 → 1,2,4
			8 → 1,2,4,8
			16 → 1,2,4,8,16
			Therefore, we can conclude that 4 is the highest common factor among all three numbers.
	 */

	public static int hcf(int number1, int number2) {
		int output = 0 ;
		while (((number1 > 0) && (number2 > 0))) {
			if ((number1 > number2)) {
				number1 = (number1 % number2);
				output = number1;
			} else {
				number2 = (number2 % number1);
				output = number2;
			}
		}
		if ((number1 == 0)) {
			output = number2;
		} else {
			output = number1;
		}
		return output; 
	}
	
	/*
		Question 31: 
			Write a Java program and compute the sum of the digits of an integer number. 
		Arguments: 
		 	int number : the number whose digits are to be summed
		Expected return value : 
    		int  : the calculated sum of the digits of the number
		Sample Input : 253 
		Sample Return Value : 10 
	 */

	public static int sumofDigits(int number) {
		int sum = 0;
		while(number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		return sum;
	}
	
	/*
		Question 32: 
			Write a Java code to display the cube of the number upto given an integer.
			      1^3 + 2^3 + 3^3 + 4^3 + 5^3 + ................... + n^3 
		Arguments: 
			int number : numbers to be cube upto given an integer
		Expected return value : 
			double : The calculated sum of cube series of a number
		Sample Input :  4
		Sample Return Value :  100.0
 	*/
	public static double cubeSeries(int number) {
		double sum = 0;
		for(int i = 1; i <= number; i++) {
		sum = sum + (i * i * i);
		}
		return sum;
	}
	
	/*
		Question 33: 
			 Write a java code to calculate the sum of following series where n is input by user. 
				1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
		Arguments: 
	    	int number : numbers to be sum upto given an integer
		Expected return value: 
			double : The calculated sum of series
		Sample Input: 3
		Sample Output: 1.8333333333333333
	 */
	public static double series(int number) {
		double sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + (1.0/i);
		}
		return sum;
	}
	
	/*
		Question 34: 
			 Write a java code to calculate the following series where n is input by user. 
				1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
		Arguments: 
		int number : numbers to be solve the series upto given an integer
		Expected return value: 
			double : The calculated series
		Sample Input: 4
		Sample Output: 0.5833333333333333
	 */
	
	public static double seriesNumber(int number) {
		double sum = 0;
		int sign = 1;
		for (int i = 1; i <= number; i++) {
			sum = sum + (1.0 * sign / i);
			sign = sign * (-1); 
		}
		return sum;
	}
	
	/*
		Question 35: 
			Write a Java code to reverse a number.
  		Arguments: 
			int number : number to be reversed 
  		Expected return value: 
  			int : reversed number 
  		Sample Input: 123456789
  		Sample Output: 987654321
	 */

	public static int reverseNumber(int number) { 
		int reverse = 0 ; 
		while(number != 0) {
			int remainder = number % 10 ; 
			reverse = reverse * 10 + remainder;
			number = number / 10 ; 
		}
		return reverse;
	}
	
	
}
