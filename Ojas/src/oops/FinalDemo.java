package oops;

public class FinalDemo {
	final int a = 12;
	

	public static void main(String[] args) {
		final int num = 10;
		System.out.println(num);
//		num = 20;
//		System.out.println(num);
		System.out.println(new FinalDemo().a);

	}

}
