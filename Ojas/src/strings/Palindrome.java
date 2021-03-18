package strings;

import java.util.Scanner;

public class Palindrome {
	static String checkPalindrome(String s1) {
		String res= "";
		for(int i = s1.length()-1; i >= 0; i--) {
			res += s1.charAt(i);
		}
		if(s1.equals(res)) {
			return "it is palindrome";
		}
		else {
			return "not palindrome";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String s1 = sc.next();
		System.out.println(checkPalindrome(s1));
	}
	
}
