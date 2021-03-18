package basicprograms;

import java.util.Scanner;

public class StartingRangeEndingRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range & Ending Range");
		int StartValue = sc.nextInt();
		int endValue = sc.nextInt();
		int i = StartValue;
		int sum = 0;
		String res = "";	
		while(i <= endValue)
		{
			res += i+",";
			sum += i;
			i++;
		}
		System.out.println(res);
		System.out.println(sum);
	}
}
