package JavaBasics01;

public class Day4 {

	public static void main(String[] args) {
		/*
		 Control Statements - Control the exe order of the program
		 if
		 if else
		 nested if else
		 switch case
		 1.Conditional Statements
		 2.Loop Statements
		 3.Jumping Statements
		 
		 if(condition)
		 {
		 statements;
		 }
		 */
		int age = 15;
		int name = 34;
		
		if (age>=18)
			System.out.println("eligible for vote");
		else
		
			System.out.println("not eligible");
		
		int numcheck = 21;
		
		if(numcheck%2==0)
		{
			System.out.println("it's an even number");
		}
		else
		{
			System.out.println("it's an odd number");
		}
		
		int num = 0;
		
		if (num<0)
		{
			System.out.println("number is negative");
		}
		else if(num>0)
		{
			System.out.println("its a positive number");
		}
		else 
		{
			System.out.println("its zero");
		}	
		
		int num1 = 92, num2 = 31, num3 = 80;
		
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1+" is largest");
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("num2 is largest");
		}
		else 
		{
			System.out.println("num3 is the largest");
		}
		
/*Switch case
 
		switch(variable)
		{
		case value1: statement;
		case value2: statement;
		case value3: statement;
		}			
*/
		
		int weekno = 8;
		
		switch(weekno)
		{
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7 : System.out.println("Saturday"); break;
		default : System.out.println("Invalid value");
		}

	}

}
