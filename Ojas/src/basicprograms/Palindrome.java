package basicprograms;

import java.util.Scanner;

import strings.Length;

public class Palindrome {
	static boolean checkPalindrome(int num) {
		boolean b = false;
		int rem = 0, rev = 0, temp = num;
		while(num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num/10;
		}
		if(temp == rev) {
			b = true;
		}
		return b;
	}
	static boolean isOdd(int num) {
		boolean b = false;
		if(num %  2 != 0) {
			b = true;
		}
		return b;
	}
	static String rangePalindrome(int startValue, int endvalue) {
		String res = "";
		for(int i = startValue; i <= endvalue; i++) {
			if(checkPalindrome(i) && isOdd(i)) {
				res += i +",";
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		System.out.println(rangePalindrome(sc.nextInt(),sc.nextInt()));
		

	}

}
