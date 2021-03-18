package recursion;

import java.util.Scanner;

public class Gcd {
	public static int gcdNumber(int n1, int n2) {
		if(n2 != 0) 
			return gcdNumber(n2, n1 % n2);
		else 
			return n1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two  numbers");
		System.out.println(gcdNumber(sc.nextInt(),sc.nextInt()));

	}

}
