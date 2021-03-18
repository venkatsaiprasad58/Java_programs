package basicprograms;

import java.util.Scanner;

public class MultplicationTableRange {
	static String dispTable(int num) {
		String res = "";
		for(int i =1; i <= 10; i++) {
			res += num + "*"+i+ "="+(num * i);
			res += "\n";
		}
		return res;
	}
	static String rangeMultiplication(int startValue,int endValue) {
		String res = "";
		for(int i = startValue; i <= endValue; i++ ) {
			res += dispTable(i);
			res += "\n";
			res += "************************\n";
		}
		return res;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of table");
		System.out.println(rangeMultiplication(sc.nextInt(),sc.nextInt()));

	}

}
