package JavaBasics01;


	class A
	{
		int a;
		void display()
		{
			System.out.println(a);
		}
	}
	
	class B extends A
		{
		String name;
		void sname()
	{
		System.out.println(name);	
	}
		}
	
	class C extends B
	{
		void check(double amt)
		{
			System.out.println(amt);
		}
	}
	
public class Inheritance {
	
	public static void main(String[] args) {
		
		B bobj = new B();
		{
			bobj.name = "Seathu";
			bobj.a = 100;
			bobj.display();
			bobj.sname();
			
		}
		
		C cobj  = new C();
		
		cobj.check(12.3);
		

	}
	
}




