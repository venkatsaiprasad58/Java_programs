package com.sample;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i< num; i++) {
			if(num % i == 0) {	
				sum = sum + i;
			}
		}
		
			
		if(num == sum)
			System.out.println("perfect number");
		else
			System.out.println("Not a perfect number");

	}

}
