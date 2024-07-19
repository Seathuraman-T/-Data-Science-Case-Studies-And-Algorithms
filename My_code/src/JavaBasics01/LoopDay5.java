package JavaBasics01;

public class LoopDay5 {

	public static void main(String[] args) {

/*
  while loop
  do while loop
  for loop
  
1) Initilization (where to start)
2) Condition (How many times)
3) Incrementation/Decrementation
*/

		
/*While loop
		Initilization;
		While(condition)
		{
			Statement;
			Inc/Dec;	
		}
*/
//Example 1
		String msg = "Hellow Word";
		int i = 0;
		while( i<=10)
		{
			System.out.println(msg);
			i++;
		}
System.out.println();
//Example 2
//Approach 1 - Printing even numbers		
		int num = 2;
		while (num<=10)
		{
			System.out.println(num);
			num=num+2;//num+=2;	
		}
		
System.out.println();
		
		int num2 = 1;
		
		while(num2<=10)//number of times only
		{
			if(num2%2==0) //condition 
			{
				System.out.println(num2 + "is an even number");
			}
			else
			{
				System.out.println(num2 + "is an odd number");
			}
			num2++;
		}
System.out.println();

		int num3 = 10;
		
		while(num3>=0)
		{
		  System.out.println(num3);
		  num3-=2;
		}
		
/* do while loop
		do
		{
			statement;
			inc/dec;
		}
		
		while(condition);
*/
		System.out.println();

		int no = 10;
		
		do
		{
			System.out.println(no);
			no--;
		}while (no>=0);
		
System.out.println();

		for (int no1 = 0; no1<=20; no1++)
			
		{
			System.out.println(no1);
		}

		
System.out.println();

		for (int no2 = 2; no2<=10; no2++)
		{
			if(no2%2==0)
			{
			System.out.println(no2 + "is an even number");
			} 
		}
System.out.println();

		//int no4 = 10;
		
		for(int i1 = 0; i1<=10; i1++)
		{
			if(i1==5)
			{
				break;
			}
			System.out.println(i1);
		}
System.out.println();		

		for(int i2 = 0; i2<=10; i2++)
		{
			if(i2==3 || i2==5 || i2==9)
			{
				continue;
			}
			System.out.println(i2);
		}
		
System.out.println();


		
	{
		
	}
	}

}
