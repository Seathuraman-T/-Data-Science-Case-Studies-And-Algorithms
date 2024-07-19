package JavaBasics01;

public class BoxMani {

	public static void main(String[] args) {
	
	Box bm = new Box();	
	System.out.println(bm.vloume());
	
	Box bm1 = new Box(1.1, 1.1, 1.1);
	System.out.println(bm1.vloume());
	
	Box bm2 = new Box(30);
	System.out.println(bm2.vloume());
	}

}
