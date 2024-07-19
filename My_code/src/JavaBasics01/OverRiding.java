package JavaBasics01;

class Parent 
{
	int roi(int no)
	{
		return no+10;
	}
	
	void display()
	{
		System.out.println(roi(30));
	}

}

class Child extends Parent
{
	int roi (int no)
	
	{
		return no+40;
	}
	
}




public class OverRiding {

	public static void main(String[] args) {
		
		Parent num = new Parent();
		
		num.display(); //40
		
		Child cnum = new Child();
		
		System.out.println(cnum.roi(50)); //90
		
		cnum.display(); //70
	
		
		
	}

}
