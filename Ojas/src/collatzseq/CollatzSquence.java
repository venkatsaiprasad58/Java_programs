package collatzseq;

import java.util.Scanner;

public class CollatzSquence {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number to get collat"
				+ "0z");
		int num = sc.nextInt();
		String res = "" +num + ",";
		while (num > 1) {
			if(num % 2 == 0) {
				num = num / 2;
			}
			else {
				num = (num * 3) + 1;
			}
			res +=num + ",";
		}
		
		System.out.println(res.substring(0,res.length()-1));
	}

}
