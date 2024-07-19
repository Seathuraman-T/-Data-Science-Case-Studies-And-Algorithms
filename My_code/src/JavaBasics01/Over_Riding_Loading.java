package JavaBasics01;

class a1
{
	int dispaly1 (int ano)
	{
		return 10+ano;
	}
}

class b1 extends a1
{
	int display1 (int bno)
	{
		return 20+bno;
	}
}

class c1 extends b1
{
	Object[] display1 (int cno, String name)
	{
		Object [] result = new Object[2];
		result [0] = cno+30;
		result [1] = name;
		return result;
		
	}
}




public class Over_Riding_Loading {

	public static void main(String[] args) {
		
		c1 cobj = new c1();
		System.out.println(cobj.dispaly1(10));
		System.out.println(cobj.display1(20));
		Object[] local = cobj.display1(30, "Seathu");
		
		for (Object value:local)
		{
			System.out.println(value);
		}

	}

}
