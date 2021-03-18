package com.sample;

import java.util.Scanner;

public class DeleteFirstTheLastCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String deletcharacter;
		
		System.out.println("Enter the String ");
		
		 deletcharacter = sc.nextLine();
		 
		StringBuffer sb = new StringBuffer(deletcharacter);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		
		

	}

}
