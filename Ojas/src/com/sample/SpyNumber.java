package com.sample;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		
		int product = 1;
		int rem,sum = 0;
		
		while(num1 > 0)
		{
			rem = num1 % 10;
		
			sum = sum +rem;
			
			num1 = num1 / 10;
			
			product = product * rem;
	
		}
		if(sum == product)
			System.out.println("spynumber");
		else
			System.out.println("not spy number");
		
	}

}
