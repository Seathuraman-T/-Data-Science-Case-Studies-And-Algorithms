package JavaBasics01;

public class SamleConst {

	int a = 100;
	int b = 200;

 int mem1 (int c)
 		{
	 		return c+a+b;
 		}

 public static void main(String[] args) {
	
	 SamleConst sm = new SamleConst();
	 int result = sm.mem1(50);
	 System.out.println(result);
	
 	}
}

