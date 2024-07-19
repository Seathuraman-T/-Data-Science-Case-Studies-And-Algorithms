package JavaBasics01;


interface check

    {
	
	String name= "Seathu";
	int salary = 10000000;
	
		void name();
		
		default void dept()
		{
			System.out.println("testing dept");
		}
		
		static void salary()
		{
			System.out.println("Confidential");
		}
    }

public class Interface implements check {
	
	public void name()
	{
		System.out.println(name);
	}
	
	void transport()
	{
		System.out.println("Mandatory");
	}
	
	
	public static void main(String[] args) {
		
//		Interface inte = new Interface();
//		
//		inte.name();
//		
//		inte.dept();
//		
//		System.out.println(salary);
//		System.out.println(name+" check");
//		
//		check.salary();
//		
//		inte.transport();
		
		check chk = new Interface();
		
		chk.dept();
		chk.name();
		check.salary();
		System.out.println(name);
		
	
		
	}
}

	