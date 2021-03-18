package basicprograms;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int number = Integer.parseInt(args[0]);
		String res = "";
		if(number < 0)
		{
			res = "Error";
			System.exit(0);
		}
		
		if (number == 0) {
			res = "Factorial of " + number + " is: 0";
			System.exit(0);
		}
			
		
		res = "Factorial of " + number + " is: " + fact(number);
		
		System.out.println(res);
		
	}
	
	private static int fact(int number) {
		// TODO Auto-generated method stub
		if(number <= 0)
			return 1;
		return number * fact(number-1);
	}

}
