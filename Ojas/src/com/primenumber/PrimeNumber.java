package com.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int i = 2, flag = 0;
		while(i < num/2) {
			if(num % i == 0) {
				flag++;
				break;
			}
			i++;
		}
		if(flag == 0) {
			System.out.println(num+" is prime");
		}
		else
			System.out.println(num + " is not prime");

	}

}
