package arrays;

public class Names {
	static void dispNames(String names[]) {
		System.out.println("Names : ");
		for(String x : names) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		
		//directly
//		String[] names = {"ramu","prasad","anusha","tarun"};
//		dispNames(names);
		
		//through cmd line arguments
		dispNames(args);
		
	}

}
