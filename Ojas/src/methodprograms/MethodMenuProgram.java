package methodprograms;


import java.util.Scanner;

public class MethodMenuProgram {
	static void menu()
	{
		String menu = "menu Driven Application \n";
	menu += "1.Addition \n";
	menu += "2.Subtraction \n";
	menu += "3.Multplication \n";
	menu += "4.Division \n";
	menu += "5.Exit \n";
	menu += "select any option";
	System.out.println(menu);
}
	static int calTotal(int f_Num,int s_Num) {
		return f_Num + s_Num;
	}
	static int Subtraction(int f_Num,int s_Num) {
		return f_Num - s_Num;
	}
	static int product(int f_Num,int s_Num) {
		return f_Num * s_Num;
	}
	static int Division(int f_Num,int s_Num) {
		return f_Num / s_Num;
	}
	static void accept() {
		System.out.println("enter the two numbers");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
		menu();
		
		int choice = sc.nextInt();
		String res ="";
		switch(choice) {
		case 1 :
			accept();
			res = "Sum =" + calTotal(sc.nextInt(),sc.nextInt());
			break;
		case 2 :
			accept();
			res = "subtraction =" + Subtraction(sc.nextInt(),sc.nextInt());
			break;
		case 3 :
			accept();
			res = "Multiplication =" + product(sc.nextInt(),sc.nextInt());
			break;
		case 4 :
			accept();
			res = "Division =" + Division(sc.nextInt(),sc.nextInt());
			break;
		case 5 :
			System.exit(0);
			break;
			default :
				res = "Inavalid option";
			
		}//switch closing
		System.out.println(res);
		}//for
		
		
	}
	}
	