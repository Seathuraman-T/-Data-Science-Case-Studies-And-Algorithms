import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Hello World";
		String check1 = "";

		 //String[] words = str.split("");

		 //StringBuilder reversed = new StringBuilder();

		 for (int i = str.length()-1; i>= 0; i--)
		 
		 {

		 check1 = check1+str.charAt(i);

		 }

		 System.out.println(check1);
		 
		 int x = 1;
		 int y = 2;
		 System.out.println(x+ " "+ y);
		 x = x+y;   //x = 1+2 = 3
		 y = x-y;   //y = 3-2 = 1
		 x = x-y;   //x = 3-1 = 2
		 System.out.println(x+" "+y);
	
		 
		 String str2 = "seathuraman";
		 
		 int count = 0;
		 
		 for (int i=0; i< str2.length(); i++)
			 
		 {
			 
			 if(str2.charAt(i) == 'a'||str2.charAt(i) == 'e'||
					 str2.charAt(i) == 'i'||str2.charAt(i) == 'o'||
					 str2.charAt(i) == 'u')
				 
			 {
				count++;
				
			 }
			 
		 }
		
		 System.out.println(count);
		 
		 
		 int num = 13;
		 
		 int count1 = 0 ;
		 
		 for (int i = 1; i<=num; i++)
		 {
			 if (num%i == 0)
			 {
				 count1++;
			 }
			 
		 }
			 if(count1 == 2)
			 {
				 System.out.println("its a prime number");
			 }
			 
			 else
			 {
				 System.out.println("not a prime number");
			 }
		 
		 
			 
			 int a = 0;
			 int b = 1;
			 int checknum = 0;
			 int length = 10;
			 System.out.print(a + " , "+ b);
			 
			 for (int i=2; i<length;i++)
			 {
				 checknum = a+b;
				 a = b;
				 b = checknum;
				 System.out.print(" , "+checknum);
			 }
			 System.out.println("");
			
			 
			 String word = "aseesaseesa";
			 
			 String revword = "";
			 
			 for(int i = word.length()-1; i>=0; i--)
			 {
				 revword = revword+word.charAt(i);
			 }
			 
			 System.out.println(revword);
			 
			 if(revword.equals(word))
			 {
				 System.out.println("its a palindrome");
			 }
			 else
			 {
				 System.out.println("not a palindrome");
			 }
			 
			 int arr2[] = {12,8,5,22};
			 int temp=0;
			 
			 for (int i = 0; i<arr2.length; i++)
				 for(int j=i+1;j<arr2.length;j++)
				 {
					if (arr2[i] < arr2[j])
					{
						temp = arr2[i];
						arr2[i] = arr2[j];
						arr2[j] = temp;
						
					}
				 }
			 for (int i = 0; i <arr2.length;i++)
			 {
				 System.out.print(arr2[i]+ " ");
			 }
			 
			 System.out.println("");
			 
			 int fact1 = 5;
			 
			 int result = 1;
			 
			for (int i=1; i<=fact1;i++)
			{
				result= result*i;
			}
			System.out.println(result);
				
			
			String name = "sethaaear";
			
			String nc ="";	
			
			for (int i=0; i<name.length();i++)
			
			{

				char newChar =name.charAt(i);				
			
				if(nc.indexOf(newChar)<0)
					
				{
					nc += newChar;
				}
			}
			
			
			System.out.println(nc);
			
			
			int array1 = 371;
			
			int array2 = array1;
			int sum = 0;
			
			while (array1>0)
				
			{
				int n = array1%10;
				sum = sum +(n*n*n);
				array1 = array1 / 10;
				
			}
			
			if (sum==array2)
			{
				System.out.println("it's an amstrong");
			}
			else
			{
				System.out.println("no an amstrong");
			}
	
			int nu = 5;
			
			for (int i=0; i<=nu; i++)
				
			{
				for (int j=0; j<=i ;j++)
					
				{
					System.out.print(" ");
				}
			//	System.out.println("");
			
				for (int k = 0; k<=i; k++)
				
					
					{
						System.out.print("*");
					}
			
					System.out.println();
				
				
			}
			
			
			
	
	
	}

}
