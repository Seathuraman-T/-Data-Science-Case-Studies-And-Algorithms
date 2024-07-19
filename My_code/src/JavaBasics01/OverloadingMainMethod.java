package JavaBasics01;

public class OverloadingMainMethod {

	void main (int a)
	{
		System.out.println(a);
	}
	
	void main (String name)
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		OverloadingMainMethod ov = new OverloadingMainMethod();
		
		ov.main(100);
		ov.main("Success");
		
		
	}

}
