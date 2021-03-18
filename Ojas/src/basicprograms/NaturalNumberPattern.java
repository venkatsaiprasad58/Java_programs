package basicprograms;

import java.util.Scanner;

public class NaturalNumberPattern {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int i = 1;
		String res = "";
		while(i <= num)
		{
			res += i+ " ";
			if(i % 4 == 0)
			{
				res += "\n";
			}
			i++;
		}
		System.out.println(res);

	}

}
