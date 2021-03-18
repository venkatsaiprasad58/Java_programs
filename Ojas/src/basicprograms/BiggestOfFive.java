package basicprograms;

public class BiggestOfFive {

	public static void main(String[] args)
	{
		String res = "";
		if(args.length != 5)
		{
			res += "Invalid \n";
			res += "Enter the only 5 values";
			System.out.println(res);
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		
		if(num1<num2)
		{
			num1 = num2;
		}
		num2 = Integer.parseInt(args[2]);
		if(num1<num2)
		{
			num1 = num2;
		}
		num2 = Integer.parseInt(args[3]);
		if(num1<num2)
		{
			num1 = num2;
		}
		num2 = Integer.parseInt(args[4]);
		if(num1<num2)
		{
			num1 = num2;
		}
		System.out.println(num1 + " "+ "is Biggest number");
	}

}
