package com.sample;

import java.util.Scanner;

public class MethodDemo 
{
	//A Method without returntype without parameters
	static void display()
	{
		System.out.println("without returntype without parameters");
	}
	
	//A Method with returntype without parameters
		static  String print()
		{
			return "with returntype without parameters";
		}

	//A Method without returntype with parameters
	static void sum(int firstNum , int secondNum)
	{
		System.out.println("sum = "+(firstNum  + secondNum));
	}
	
	//A Method with returntype with parameters
	static int product(int thirdNum , int fourthNum)
	{
		return thirdNum * fourthNum;
	}
	
	public static void main(String[] args) 
	{
		display();
		
		
		System.out.println(print());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number");
		int secondNum = sc.nextInt();
			
		sum(firstNum, secondNum);
		
		
		
		System.out.println("Enter the third number");
		int thirdNum = sc.nextInt();
		System.out.println("Enter the fourth number");
		int fourthNum = sc.nextInt();
	
		
		System.out.println(product(thirdNum,fourthNum));
		
		
	}

}
