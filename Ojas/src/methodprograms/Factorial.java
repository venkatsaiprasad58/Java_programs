package methodprograms;

import java.util.Scanner;

public class Factorial {
	static String findFactorial(int num) {
		String res = "";
		int fact = 1;
		while(num >= 1) {
			res += num +"*";
			fact = fact * num;
			num--;
		}
		return res.substring(0,res.length()-1) +"=" +fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get factorial");
		System.out.println(findFactorial(sc.nextInt()));
	}

}
