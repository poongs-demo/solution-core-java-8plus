
package solutionjavabasics3;

public class MainSolutionJavaBasics3 {

	public static void main(String[] args) {
		
		//Question 26: Write a Java code to display 'n' natural numbers.
		  System.out.println("The natural numbers are : ");
		  SolutionJavaBasics3.naturalNumbers(5);
				
		//Question 27: Write a Java code sum of 'n' natural Number.
	        //                        1 + 2 + 3 + 4 + 5.......n
		  System.out.println("The sum of natural numbers is =  " +SolutionJavaBasics3.sumofNaturalNumber(5));
		
		//Question 28: Write a Java code to Count Number of Digits in an Integer number.
		  System.out.println("Count the number of digits in a given number =  " +SolutionJavaBasics3.countDigits(456));	
		
		//Question 29: Write a java code to find the value of one number raised to the power of another (Do not use Java built-in method).
		  System.out.println("Power of a given numbers =  " +SolutionJavaBasics3.powerofNumber(2,5));
		
		//Question 30: Write a Java code to calculate highest common factor(HCF).
		  System.out.println("gcd value for the two given integer numbers are " +SolutionJavaBasics3.hcf(5,10));
				
		//Question 31: Write a Java code and compute the sum of the digits of an integer number. 
		  System.out.println("The sum of the digits of the number is : " +SolutionJavaBasics3.sumofDigits(253));
				
	       //Question 32:Write a Java code to display the cube of the number upto given an integer.
	       //                     1^3 + 2^3 + 3^3 + 4^3 + 5^3 + ................... + n^3 
		 System.out.println("The sum of cube series is :  " +SolutionJavaBasics3.cubeSeries(4));
		
	       //Question 33: Write a java code to calculate the sum of following series where n is input by user. 
	       //	                 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
		  System.out.println("Sum of the series : " +SolutionJavaBasics3.series(3));
				
		//Question 34:Write a java code to calculate the following series where n is input by user. 
	       //                   	1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
		  System.out.println("Sum of the alternate sign series : " +SolutionJavaBasics3.seriesNumber(4));
				
		//Question 35: Write a Java code to reverse a number
		  System.out.println("Reverse number :  " + SolutionJavaBasics3.reverseNumber(123456789));				
	}
}
