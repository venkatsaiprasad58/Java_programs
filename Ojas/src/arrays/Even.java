package arrays;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 5 elements");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			}
		System.out.println("Reverse order");
		System.out.println(evenNumberOfArray(num));
		sc.close();
	}

	private static String evenNumberOfArray(int[] num) {
		String res = "";
		for(int i : num) {
			if(i % 2 == 0) {
				res += i + "";
			}
			else
				res += i;
		}
		return res.substring(0,res.length());
	}

}
