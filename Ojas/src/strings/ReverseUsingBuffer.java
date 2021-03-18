package strings;

import java.util.Scanner;

public class ReverseUsingBuffer {
	static String checkreverse(String s1) {
		String res = "";
		StringBuffer sb = new StringBuffer(s1);
		res = sb.reverse().toString();
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String s1 = sc.next();
		System.out.println(checkreverse(s1));
	}

}
