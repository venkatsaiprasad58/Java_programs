package multiplicationprograms;

import java.util.Scanner;

public class RussianMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get russian multiplication");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		String res =firstNum + ":"  + secondNum + "\n";
		int total = 0;
		if(firstNum % 2 != 0) {
			total += secondNum;
		}
			
		while(firstNum > 1) {
			firstNum = firstNum / 2;
			secondNum = secondNum * 2;
			res += firstNum + ":"  + secondNum + "\n";
			if(firstNum % 2 != 0) {
				total += secondNum;
			}
			
			
		}
		System.out.println(res);
		System.out.println("product : "+total);
			
		

	}

}
