package JavaBasics01;



public class Greeting11 {

// No parameter and No return
	void Noparams() 
	{
		System.out.println("No Parameter and No Return jut print");
	}

// No params but return value

	String Npstring()
	{
		return ("No Parameter But returns string");
	}

// Parameter and No return

	void ParamNo (String name)
	{
		System.out.println("Test on "+ name);
	}

//Params and Return

	int ParamReturn(int mark)
	{
		return (mark +50);
	}
	
// Approach -1 store data into the variable
	
	int mark;
	String sname;
	char result;
	
	void examResult()
	{
		System.out.println(mark+" "+ sname+" " +result);
	}
// Approach - 2 storing data in method
	
	void approachData(String name1, int number, char rate)
	{
		mark = number;
		sname = name1;
		result = rate;
	}

// Approach 3 - Using constructor
	
	Greeting11(String newname, int average, char gr)
	{
		mark1 = average;
		sname1 = newname;
		result1 = gr;
	}
	
	int mark1;
	String sname1;
	char result1;
	
	void examResult1()
	{
		System.out.println(mark1+" "+ sname1+" " +result1);
	}
	
}
