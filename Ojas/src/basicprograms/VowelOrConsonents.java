package basicprograms;

import java.util.Scanner;

public class VowelOrConsonents {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String res = sc.next().toUpperCase();;
		String s = res;
		switch(res)
		{
				case "A": 
					
				case "E": 
					
				case "I": 
					
				case "O": 
					
				case "U": 
					res = res +" " + "is vowel";
					break;
				default :
					res = res + "is consonant";
		}
		System.out.println(res);
	}

}
