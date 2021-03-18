package basicprograms;

import java.util.Scanner;

public class Month 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month");
		String month = sc.next();
		String res = "";
		String str = month.toLowerCase();
		
		switch (str)
		{
		case "jan" : 
				res = month +" " + "is 31 days";
				break;
				
		case "feb" : 
			res = month +" " + "is 28 days";
				break;
		case "mar" : 
			res = month +" " + "is 31 days";
				break;
		case "apr" : 
			res = month +" " + "is 30 days";
				break;
		case "may" : 
			    res = month +" " + "is 31 days";
				break;
		case "jun" : 
				res = month +" " + "is 30 days";
				break;
		case "jul" : 
			res = month +" " + "is 31 days";
				break;
		case "aug" : 
			res = month +" " + "is 31 days";
				break;
		case "sep" : 
			res = month +" " + "is 30 days";
				break;
		case "oct" : 
			res = month +" " + "is 31 days";
				break;
		case "nov" : 
			res = month +" " + "is 30 days";
				break;
		case "dec" : 
			res = month +" " + "is 31 days";
				break;
				default :
					res = "Entered invaid";
		}
		System.out.println(res);

	}

}
