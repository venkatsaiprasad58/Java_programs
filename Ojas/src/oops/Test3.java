package oops;

@FunctionalInterface
 interface Cal2 {
	String sum(int a, int b);
}
public class Test3 {
	public static void main(String[] args) {
		Cal2 c = (x,y) -> {
			return"sum = "+ (x + y);
		};
		System.out.println(c.sum(12,20));
	}

}