package strings;

import java.util.Scanner;

public class AdamNumber {

	static boolean isAdamNumber(int number) {
		boolean b = false;
		
		String num = "" + number;
		StringBuffer buffer = new StringBuffer(num);
		int square = (int) Math.pow(number, 2);
		int square2 = (int) Math.pow(Integer.parseInt(buffer.reverse().toString()), 2);
		String sqr = "" + square;
		StringBuffer sb = new StringBuffer(sqr);
		if(square2 == Integer.parseInt(sb.reverse().toString())) {
			b = true;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check adam or not: ");
		int number = scanner.nextInt();
		System.out.println(isAdamNumber(number));
		scanner.close();
	}
}

