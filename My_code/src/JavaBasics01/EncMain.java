package JavaBasics01;


public class EncMain {

	public static void main(String[] args) {

		EncapsulationObj en = new EncapsulationObj();
		
		en.setAccount(123456);
		System.out.println(en.getAccount());

		en.setName("Srinath");
		System.out.println(en.getName());
	}

}
