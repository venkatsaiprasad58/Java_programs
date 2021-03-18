package methodprograms;

import java.util.Scanner;

public class Even {
	static boolean isEven(int num) {
		boolean b = false;
		if(num % 2 == 0) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		if(isEven(sc.nextInt()))
		{
			System.out.println("Even number");
		}
		else
			System.out.println("Odd number");

	}

}
