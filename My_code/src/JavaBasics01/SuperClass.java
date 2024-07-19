package JavaBasics01;


public class SuperClass {
	
	int number = 100;
	
	void non()
	{
		System.out.println("Super Class check");
	}
}

class Super2 extends SuperClass
{
	int number = 200;
	
	void non()
	{
		//System.out.println(super.number);
		super.non();
	}
}



