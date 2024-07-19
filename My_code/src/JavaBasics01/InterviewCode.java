package JavaBasics01;

import java.util.Arrays;


public class InterviewCode {

	public static void main(String[] args) {
		
//****************************************		
System.out.println("Reverse Number");

	int num = 234567;
	int rev = 0;
	
	while(num!=0)
	{
		rev = rev*10+num%10;
		
		num= num/10;
	}
	System.out.println(rev);
		
//*********************************************
System.out.println("String Buffer");

	int num1 = 345432;
	
	StringBuffer sb = new StringBuffer(String.valueOf(num1));
	
	StringBuffer rever = sb.reverse();
	
	System.out.println(rever);

//***************************************************
System.out.println("Palindrome");

	int num2 = 123321;
	int checkNum = num2;
	int num3 = 0;
	
	while(num2!=0)
	{
		num3 = num3*10 +num2 %10;
		num2 = num2/10;
	}
	 if (num3==checkNum)	 
		 System.out.println(num3 +" is palindrome"); 
	 else 
		 System.out.println(num3+" not palindrome");

//***********************************************************
System.out.println("suming the numbers in an Array");

	int [] ar = {1,2,3,4,5};
	
	int sum=0;
	
	for (int i3 = 0; i3<ar.length; i3++)
	{
		sum = sum+ar[i3];
	}
	System.out.println(sum);
	
int x2 =0;	
for(int y1: ar)
	{
	 x2 = x2+y1;
	}
System.out.println();
System.out.println(x2);
//*****************************************************************
System.out.println("printing even and odd count");

	int[] ar1 = {1,2,3,4,5,6};
	

	//int odd[] = {};
	
	for (int i5=0; i5<ar1.length; i5++)
	{
		if(ar1[i5]%2==0)
		{
			int even = ar1[i5];	
			System.out.println(even);
		}
		else 
		{
			System.out.println(ar1[i5] + " odd number");
		}

	}
//*******************************************************************
// Linear Search
System.out.println("search and sort");

 	int[] arr = {23,34,23,44,4,40,99};
 	
 	for (int i6 = 0; i6<arr.length;i6++)
 		
 	{
 		if(arr[i6]==34 || arr[i6]==99)
 		{
 			int nummy = arr[i6];
 			System.out.println(nummy);
 		}
 	}

//******************Sorting an Array**********************************************
 System.out.println("sort asscending");

 	int [] arr1 = {1,5,7};
 	
 	int check1 = 0;
 	
 	for(int k = 0; k<arr1.length; k++)
  		for (int l = k+1; l<arr1.length; l++)
 		
 		{
 			if(arr1[k]>arr1[l])
 			{
 				check1 = arr1[k];
 				arr1[k]= arr1[l]; 
 				arr1[l] = check1;
 			}
 	}
 	for(int k=0;k<arr1.length;k++)
 	{
 		System.out.println(arr1[k]);
 	}
 	
 		
 	
 	
 	
 	
System.out.println();

String ss = "My,name@Seathu";

String []ss1 = ss.split(",");

System.out.println(Arrays.toString(ss1));

String [] ss2 = ss1[1].split("@");

System.out.println(Arrays.toString(ss2));

//System.out.println(ArrayOfStrings(ss1) + ArrayOfStrings(ss2));

String name = "John Kennedy";
System.out.println(name.toLowerCase().contains("john"));




	}

}
