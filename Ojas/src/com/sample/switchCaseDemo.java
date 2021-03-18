package com.sample;

import java.util.Scanner;

public class switchCaseDemo 
{
	static String checkEven(int value)
	{
		String res = "";
		switch(value % 2)
		{
		case 0 : res = value + " " + "is Even number";
		break;
		case 1 :  res = value +" " + "is odd number";
		break;
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		System.out.println(checkEven(num));

	}

}
