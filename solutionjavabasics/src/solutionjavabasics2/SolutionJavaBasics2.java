package solutionjavabasics2;

public class SolutionJavaBasics2 {

	/*
		Question 16: 
			Telephone Bill
				Write a java code to calculate the monthly telephone bills as per the following rule: 
				Minimum Rs. 200 for up to 100 calls. 
				Plus Rs. 0.60 per call for next 50 calls. 
				Plus Rs. 0.50 per call for next 50 calls. 
				Plus Rs. 0.40 per call for any call beyond 200 calls.
		Arguments: 
    			int numberOfCalls : number of calls to be used
		Expected return value: 
			double : The calculated telephone bill amount
		Sample Input: 130
		Sample Output: 218.0
	 */
	public static double telephoneBill(int numberOfCalls) {
		double bill = 0;
		 if(numberOfCalls <= 100)
	        {
	            bill = 200;
	        } 
	        else if(numberOfCalls > 100 && numberOfCalls <= 150)
	        {
	            bill = 200 + (numberOfCalls - 100) * 0.60;
	        } 
	        else if(numberOfCalls > 150 && numberOfCalls <= 200)
	        {
	            bill = 200 + 50 * 0.60 + (numberOfCalls - 150) * 0.50;
	        } 
	        else
	        {
	            bill = 200 + 50 * 0.60 + 50 * 0.50 + (numberOfCalls - 200) * 0.40;
	        }
		 return bill;
	}
	 
	/*
		Question 17:
			Write a Java code to Find Largest Among 3 integer Numbers.
		Arguments: 
  			int number1 : first integer number 
      		int number2 : second  integer number 
      		int number3 : third integer number 
  		Expected return value :
     		int : largest number among number1, number2 and number3
  		Sample Input : 50, 40, 30
    		Sample Return Value : 50
	 */

	public static int largestNumber(int number1, int number2, int number3) {
		int output = 0;
		if(number1 > number2 && number1 > number3) {
			output = number1;
		} 
		else if(number2 > number1 && number2 > number3) {
			output = number2;
		} 
		else {
			output = number3;
		}
		return output;
	}
	
	/*
		Question 18: 
			Write a Java code to check whether an year (integer number) is a leap year or not.
  		Arguments: 
			int year : year number
  		Expected return value: 
  			boolean : calculated leap year value 
  		Sample Input: 2012
  		Sample Output: true
	 */
	
	public static boolean isLeapYear(int year) {
		boolean number1 = (year % 4) == 0;
		boolean number2 = (year % 100) != 0;
		boolean number3 = ((year % 100 == 0) && (year % 400 == 0));
		return number1 && (number2 || number3);
       }
	
	/*
		Question 19: 
			Write a Java code to generate random integer in a specific range.
		Arguments: 
			int startNumber : starting number
			int endNumber : end number
		Expected return value: 
			int : The generates a random number between starting number and end number
		Sample Input: 10, 20 
		Sample Output: 16
	 */
	
	public static int randomNumber(int startNumber, int endNumber) {
		int randomNumber = startNumber + (int)(Math.random() * ((endNumber - startNumber) + 1));
	    	return randomNumber;
	}
	
	/*
		Question 20: 
			Write a Java code for factorial of a number.
		Arguments: 
			int number : number to be factorial
		Expected return value: 
			int : calculated factorial value		
		Sample Input:  5
		Sample Output: 120
	 */
	
	public static int factorial(int number){
		int output = 0 ;
		if(number == 1) {
			output = 1;
		}
		else {
			//Recursion: Function calling itself!!
			output = factorial(number - 1) * number ;
		} 
		return output;
	}

	 /*
	Question 21: 
		Write a Java code that takes an integer number between 1 and 7 and displays the name of the weekday.
	Arguments: 
		int day: day number between 1 to 7 
	Expected return value: 
		String : display day name corresponding to day number
	Sample Input: 3 
	Sample Output: Wednesday
	*/
	
	public static String getDayName(int day) {
        String dayName = " " ;
        switch(day) {
            case 1: 
    		dayName = "Sunday"; 
    		break;
            case 2: 
		dayName = "Monday";
		break;
            case 3: 
		dayName = "Tuesday"; 
		break;
            case 4: 
		dayName = "Wednesday"; 
		break;
            case 5: 
		dayName = "Thursday"; 
		break;
            case 6: 
		dayName = "Friday"; 
		break;
            case 7:
		dayName = "Saturday"; 
		break;           
            default:
		dayName = "Invalid day range";
        }

        return dayName;
    }
	
	/*
		Question 22: 
		Current Bill:
		Write a java code to calculate the monthly current bills as per the following rule: 
			i) if your units is less than 100 then per unit cost is ₹1.
			ii) if your units is between 100 to 200 then per unit cost is ₹1.20.
			iii) if your units is between 200 to 300 then per unit cost is ₹2.
			iv)if your units is greater than 300 then per unit cost is ₹3.
		Arguments: 
			int units : units to be used
		Expected return value: 
			float : The calculated current bill payment
		Sample Input: 256
		Sample Output: 432.0
	 */

	public static float currentBill(int units) {
		float billPay = 0;
		if(units < 100)
		 {
		      billPay = (float) (units * 1.0);
		  }
		else if(units >= 100 && units < 200)
		 {
		      billPay=(float) (units * 1.20);
		  }
		else if(units >= 200 && units < 300)
		 {
		   billPay = (float) (100 * 1.20 + (units-100) * 2);
		 }
		else if(units > 300)
		{
		    billPay = (float) (100 * 1.20 + 200 * 2 + (units - 300) * 3);
		}
		return billPay;
	}
	
	/*
		Question 23: 
			A school has following rules for grading system:
				a. Below 25 - F
				b. 25 to 45 - E
				c. 45 to 50 - D
				d. 50 to 60 - C
				e. 60 to 80 - B
				f. Above 80 - A
			Ask user to enter mark and print the corresponding grade.
		Arguments: 
			int marks : mark for identifying the grade
		Expected return value: 
			char : Display the calculated grade value corresponding to the marks
		Sample Input: 68
		Sample Output: B
	*/
	public static char grade(int marks) {
		char output = ' ';
		if(marks < 25){
			output = 'F';
		}
		else if((marks >= 25) && (marks < 45)){
			output = 'E';
		}
		else if((marks >= 45) && (marks < 50)){
			output = 'D';
		 }
		else if((marks >= 50) && (marks < 60)){
			output = 'C';
		}
		else if((marks >= 60) && (marks < 80)){
			output = 'B';
		}
		else if((marks >= 80) && (marks <= 100)){
			output = 'A';
		}
		return output;
	}	
		
	/*
		Question 24: 
			Write a Java code to Check Whether a Number is Even or not
		Arguments: 
			int number: number to be checked 
		Expected return value: 
			boolean : value will be either true or false 
		Sample Input:  10
		Sample Output: 	true	 
	*/
	
	public static boolean checkEven(int number) {
		boolean number1 = ((number%2) == 0);
		return number1;
	}
		
	/*
		Question 25: Write a Java code to Check Whether a Number is Positive or Negative or Zero
		Arguments: 
		double number :	number to be checked
		Expected return value: 
			String : value will be either Positive or Negative or Zero 
		Sample Input:  10.5
		Sample Output: positive 
	*/
		
	public static String positiveOrNegative(double number) {
		String output= " ";
		if(number > 0.0) {
			output = " Positive ";
		}
		else if(number < 0.0) {
			output = "Negative";
		}
		else {
			output = " Zero ";
		}
		return output;
	}
	
}
