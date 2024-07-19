package JavaBasics01;

public class Greetings11main {

	public static void main(String[] args) {
		
		Greeting11 gr = new Greeting11( "Srinath",1200,'P');
		
		gr.Noparams();
		
		System.out.println(gr.Npstring());
		
		gr.ParamNo(" Seathu");
		
		System.out.println(gr.ParamReturn(50));
		
		gr.mark = 100;
		gr.result = 'P';
		gr.sname = "Srinath";
		gr.examResult();

		gr.approachData("Srinath Thiyagarajan",1100, 'P');
		gr.examResult();
		gr.examResult1();
	}

}
