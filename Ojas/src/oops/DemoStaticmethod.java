package oops;

public class DemoStaticmethod {
	static int num1 = 10;
	int num2 = 20;
	void sum() {
		System.out.println("Sum = "+(num1 + num2));
	}
	static void prod() {
		System.out.println("prod ="+(num1 * num1));
	}

	public static void main(String[] args) {
		DemoStaticmethod.prod();
//		sum();
		prod(); //static
		DemoStaticmethod obj = new DemoStaticmethod();
		obj.sum();
		obj.prod();
		
	}

}
