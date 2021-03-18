package com.sample;

public class AbsoluteValue {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num < 0)
		{
			num = -num;
		}
		System.out.println(num);

	}

}
