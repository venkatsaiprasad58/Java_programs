package com.sample;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int product = num * num;
		System.out.println(product);
		
		int temp1 = product % 10;
		int temp2 = product / 10;
		
		int t = temp1 + temp2;
		
		System.out.println(t);
		
		if(num == t)
			System.out.println("Neon number");
		else
			System.out.println("not a neon number");

	}

}
