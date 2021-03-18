package arrays;

public class StringToChar {
	static void dispNames(char names[]) {
		System.out.println("Names : ");
		for(char x : names) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		
		String names = "OJAS";
		dispNames(names.toCharArray());
		
	}
}


