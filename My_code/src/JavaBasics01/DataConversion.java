package JavaBasics01;

public class DataConversion {

	public static void main(String[] args) {
		
// Scenario 1 - String  --> int, double,boolean
		
//String -> int
		String s = "10";
		String s1 = "20";
		int ssum = Integer.parseInt(s)+Integer.parseInt(s1);
		System.out.println(ssum);
		
//String -> Double
		String ft = "5.5";
		String ft1 = "5.6";
		double ftf = Double.parseDouble(ft1)+Double.parseDouble(ft);
		System.out.println(ftf);
		
//String -> Booolean
		String b1 = "check"; //other than true, if you pass any string that will return false
		
		System.out.println(Boolean.parseBoolean(b1));
		
		
		
//Scenario 2 - int, double, boolean and char --> String
		
		int a1 = 10;
		double d2 = 10.5;
		char aa = 's';
		boolean boo1 = true;
		
 String ss1 = String.valueOf(a1);
 String ss2 = String.valueOf(d2);
 String ss3 = String.valueOf(aa);
 String boo = String.valueOf(boo1);
 
 System.out.println(ss1);
 System.out.println(ss2);
 System.out.println(ss3);
 System.out.println(boo);
		
	}

}
