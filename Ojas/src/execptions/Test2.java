package execptions;
import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("Invalid");
			System.out.println("Enter the 2 numbers");
			return;
		}
		try {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("sum = "+(num1 + num2));
		}
		catch (Exception e) 
		{
			System.out.println("Enter the valid numbers?");
			
		}
	}

}
