package recursion;

import java.util.Scanner;

public class FindingDigits {
	
	static int digits(int num) {
		if(num == 0)
			return 0;
		num = num / 10;
			return 1 + digits(num);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a number :");

		int num = sc.nextInt();
		
		System.out.println(digits(num) + " digits in given number ");
	}

}
