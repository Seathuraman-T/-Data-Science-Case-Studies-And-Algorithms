package JavaBasics01;

public class MultipleInheretance extends MultiClass implements Multi1, Multi2 {
	 
	public void ageing ()
	{
		System.out.println("It's just number");
	}
	public static void main(String[] args) {
		
		MultipleInheretance mul = new MultipleInheretance();
	
		mul.ageing();
		mul.gender();
		mul.naming();
	
	}

}
