package methodprograms;

import java.util.Scanner;

public class EvenInGivenRange {

	static boolean isEven(int num) {
		boolean b = false;
		if(num % 2 == 0) {
			b = true;
		}
		return b;
	}
	static String rangeEvenNo(int startValue,int endValue) {
		String res = "";
		for(int i = startValue; i <= endValue; i++) {
			if(isEven(i)) {
				res += i+ ",";
			}
		}
		return res.substring(0,res.length()-1);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		System.out.println(rangeEvenNo(sc.nextInt(),sc.nextInt()));

	}//method closing

}
