package patterns;

import java.util.Scanner;

public class CollatzSequence {
	public static class Collatzsequence {
		public static void main(String[] args) {
			System.out.println("Enter any Number");
			Scanner scn = new Scanner(System.in);
			int num = scn.nextInt();
			String res = num+" : ";
			while(num > 1) {
				if (num % 2 == 0) {
					num = num / 2;
				}
				else {
					num = (num * 3) + 1;
				}
				res += num +" ";
			}
			System.out.println(res);

		}


	}

}
