package JavaBasics01;



public class stringDay9 {

	public static void main(String[] args) {

		String str = "welcome";
		
		String str1 = "";
		
	for (int i=str.length()-1; i>=0; i--)
	{
		str1 = str1+str.charAt(i);
		
	}
	System.out.println(str1);
//*****************************************************	
System.out.println();	
	
	char [] ca = str.toCharArray();
	
	String cca = "";
	
	for (int j = str.length()-1; j>=0; j--)
	{
		cca = cca+ca[j];
	}
System.out.println(cca);

//******************************************************

StringBuffer s = new StringBuffer("testing");

StringBuffer bufcheck = s.reverse();

System.out.println(bufcheck); 

StringBuilder s1 = new StringBuilder("Checking");

String s3 = "one";

String s4 = "Two";

String finString = s3.concat(s4);

System.out.println(finString);

//****************Palindrome*********
System.out.println("");

	String pal = "madam";
	String checkpal = "";
	
	for(int f = pal.length()-1; f>=0; f--)
	{
		checkpal = checkpal+pal.charAt(f);
	}
	 if(pal.equals(checkpal))
	 {
		 System.out.println(pal +" given string is palindrome");
	 }
	 else {
		System.out.println(pal +" not a palindrome");
	}
//***************************removing junk or special char************************************
	 
	 String jn = "Seat#%$^%&    ^hu&Valli";
	 String finaljn = "";
	 String low = jn.toLowerCase();
	 
	 for(int h = 0; h<low.length();h++)
	 {
		 if (low.charAt(h)>='a' && low.charAt(h) <='z')
		 {
			finaljn = finaljn+low.charAt(h); 
		 }
	 }
	 System.out.println(finaljn);
	 
//*******************************************************************************
	 
	 
	 String ss = "sfseattthjhuu";
	 String checkss = "";
	 
	 for (int i = 0; i < ss.length(); i++) {
		if (checkss.isEmpty()) {
			checkss = String.valueOf(ss.charAt(i));
		} else if (!checkss.contains(String.valueOf(ss.charAt(i)))) {
			checkss = checkss.concat(String.valueOf(ss.charAt(i)));
		}
	 }
	 System.out.println("checkss - " + checkss);
	 	
		 
}
}