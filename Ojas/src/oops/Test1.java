package oops;

public class Test1 {
	static int value;
	static {
		value = 20;
		System.out.println("static block");//first
	}
	{
		System.out.println("Instance initalize/Non statc block");//third
	}
	Test1() {
		System.out.println("default constuctor");//finally constructor
	}

	public static void main(String[] args) {
		System.out.println("welcome");//second
		System.out.println("value =" +value);//third
		Test1 t = new Test1();
		
	}

}
