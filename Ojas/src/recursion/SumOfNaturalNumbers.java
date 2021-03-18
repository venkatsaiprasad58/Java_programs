package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers { 
	
	static int naturalNumber(int num) {
		if(num != 0)
			return num + naturalNumber(num - 1);
		else
			return num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get sum of natural numbers");
		int num = sc.nextInt();
		System.out.println(naturalNumber(num));
		sc.close();
	}

}
