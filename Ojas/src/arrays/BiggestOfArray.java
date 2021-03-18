package arrays;
import java.util.Arrays;

public class BiggestOfArray {
	static int big(int values[]) {
		int big = values[0];
		for(int i = 0; i<values.length; i++) {
			if(values[i] > big) {
				big = values[i];
			}
		}
		return big;
			
	}
	
	
	public static void main(String[] args) {
		int[] values = {10,40,60,44};
	System.out.println(	big(values) + " is biggest number");
		
	}

}
