package JavaBasics01;


import java.util.Scanner;


public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int nos  = 12;
		System.out.println("Enter a number for division");
		int cal = sc.nextInt();
		try {
			System.out.println(nos/cal);
		} catch (ArithmeticException e) {
			System.out.println("Provide an valid input");
		}
		
		int a[] =  new int [5];
		System.out.println("Enter the position");
		int pos = sc.nextInt();
		System.out.println("Enter The value");
		int values = sc.nextInt();
		
		try {
			a[pos] = values;
			System.out.println(a[pos]);	
		} catch (Exception e) {
			System.out.println("enter the value inside the range");
		}
		
		
		
		String stri = null;
		try {
			System.out.println(stri.length());
		} catch (NullPointerException e) {
			System.out.println("String not available");
		}

	
		String strr = "welcome";
		
		try {
			int numm = Integer.parseInt(strr);
			System.out.println(numm);
		} catch (NumberFormatException e) {
			System.out.println("Provide the valid integer");
		}
		 
		System.out.println("Exe completed");
		
	}

}
