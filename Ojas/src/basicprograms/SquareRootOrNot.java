package basicprograms;

import java.util.Scanner;

public class SquareRootOrNot {
	static boolean isSquareRoot(int num) {
		for(int i = 1; i*i <= num;i++) {
			if((num % i == 0	) && (num / i == i)) {
				return true;
			}
		}	
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); 
		if(isSquareRoot(num)) {
			System.out.println("squareRoot");
		}
		else {
			System.out.println("not square root");
		}
	}

}
