package oops;
//lambda
interface Cal {
	void wish();
}
public class Test2 {
	public static void main(String[] args) {
		Cal c = () -> System.out.println("welcome");
		c.wish();
	}
}
