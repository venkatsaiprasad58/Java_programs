package com.primenumber;

import java.util.Scanner;

public class PrimeNumberInGivenrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startvalue = sc.nextInt();
		System.out.println("Enter the ending number");
		int endvalue = sc.nextInt();
		String res = "";
		for(int num = startvalue; num <= endvalue; num++) {
		int i = 2, flag = 0;
		while(i < num / 2) {
			if(num % i == 0) {
				flag++;
				break;
			}
			i++;
		}//whileclosing
		if(flag == 0) {
			res += num + ",";
		}
	}
		System.out.println(res.substring(0,res.length()-1));

	}//main

}//class
