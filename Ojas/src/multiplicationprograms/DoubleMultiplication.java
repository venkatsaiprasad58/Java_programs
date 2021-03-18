package multiplicationprograms;

import java.util.Scanner;

public class DoubleMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to multiply");
		int startvalue = sc.nextInt();
		int endvalue = sc.nextInt();
		String res = "";
		for(int i = 1; i <= 10; i++) { 
			res  += startvalue + "*" + i + " = " +(startvalue * i)  +"\n";
		}
		System.out.println(res);

	}
}
