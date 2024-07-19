package JavaBasics01;



public class arrayDay6 {

	public static void main(String[] args) {

//Approach 1
		int a [] = new int[5];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

//Approach 2
		
		int ab[] = {12,56,34,45};
		
// Length of an Array
		
		System.out.println(ab.length);

//Read specific location
		
		System.out.println(ab[3]);
		
//read completed array
		
		for(int i = 0; i<ab.length; i++)
		{
			System.out.println(ab[i]);
		}

//enhanced for loop
		
		for(int y : ab)
		{
			System.out.println(y);
		}

//2-Dimensional array
		
		
	int[][] abc  = { {100,200},{300,400}, {500,600}};
	
	System.out.println(abc.length); //row
	System.out.println(abc[2].length); //columns
	System.out.println(abc[2][1]);
	
System.out.println();

	for (int r = 0; r<abc.length;r++)
	{
		for (int c = 0; c<abc[r].length; c++)
		{
			System.out.print(abc[r][c] +" ");
		}
		System.out.println();
	}
	
//*****enhanced for loop
System.out.println();
	
	for(int[] ar :abc)
	{
		for(int x : ar)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
	}
	
	
	
	
	
	}

}
