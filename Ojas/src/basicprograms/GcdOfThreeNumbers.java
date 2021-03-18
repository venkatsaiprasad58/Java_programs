package basicprograms;

import java.util.Scanner;

public class GcdOfThreeNumbers {
	static int gcdNumber(int first,int second ,int third) {
		int rem = first;
		while(true) {
			if((first % rem == 0) && (second % rem == 0) && (third % rem == 0)) {
			break;
		}
		rem--;
		}
		return rem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int first = sc.nextInt();
		System.out.println("Enter the second number");
		int second = sc.nextInt();
		System.out.println("Enter the third number");
		int third = sc.nextInt();
		System.out.println(gcdNumber(first,second,third));
	}

}
