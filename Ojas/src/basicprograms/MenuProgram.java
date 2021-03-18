package basicprograms;

import java.util.Scanner;

public class MenuProgram {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true) {
		String menu = "menu Driben Application \n";
			menu += "1.Addition \n";
			menu += "2.Subtraction \n";
			menu += "3.Multplication \n";
			menu += "4.Division \n";
			menu += "5.Exit \n";
			menu += "select any option";
			System.out.println(menu);
			String res = "";
			int choice = sc.nextInt();
			switch(choice) {
			
				case 1 :
					System.out.println("Enter any two number to perform addition");
					res = "Addition = " +(sc.nextInt() + sc.nextInt());
					break;
				case 2 :
					System.out.println("Enter any two number to perform subtraction");
					res = "Subtaction = " +(sc.nextInt() - sc.nextInt());
					break;
				case 3 :
					System.out.println("Enter any two number to perform multiplication");
					res = "product = " +(sc.nextInt() * sc.nextInt());
					break;
				case 4 :
					System.out.println("Enter any two number to perform division");
					res = "division = " +(sc.nextInt() / sc.nextInt());
					break;
				case 5 :
					System.exit(0);
					break;
			default :
				res = "invalid";
			
			}//closing switch
		
			System.out.println(res);
		
		}//closing while
		

	}//closing main method

}//closing class
