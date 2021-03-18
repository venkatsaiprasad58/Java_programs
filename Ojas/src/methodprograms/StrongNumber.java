package methodprograms;

import java.util.Scanner;

public class StrongNumber {
	
	static int strngNumber(int num) {
		
		int rem,rev= 0,temp = num;
		
		while(num > 0) {
			int fact =1;
			rem = num % 10;
			for(int i = rem; i>=1 ; i--) {
				fact = fact * i;
			}
			rev = rev + fact;
			num = num / 10;
		}
		if(rev == temp) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("not strong number");
		
	}
		
		return rev;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(strngNumber(num));
	}

}
