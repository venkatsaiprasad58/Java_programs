package strings;

import java.util.Arrays;

public class SplitDemo {

	public static void main(String[] args) {
		
		String s = "a + b + c ";
		
		String[] result = s.split(" //+");
		
		System.out.println(Arrays.toString(result));

	}

}
