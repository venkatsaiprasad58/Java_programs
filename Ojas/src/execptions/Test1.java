package execptions;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("prasad");
		try {
			int a = 10,b = 0;
			System.out.println("c = "+a/b);//arthmetic excption
		}
		catch(ArithmeticException e) {
			System.out.println("dont enter denominator as a zero");
		}
		
		System.out.println("welcome");
		System.out.println("to ojas");
		
		

	}

}
