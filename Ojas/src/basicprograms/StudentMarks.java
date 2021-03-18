package basicprograms;

import java.util.Scanner;

public class StudentMarks {
	static boolean inPass(int marks[]) {
		boolean b = false;
		int count = 0;
		for(int i = 0;  i < marks.length; i++) {
			if(marks[i] >= 75) {
				count++;
			}
		}
		
		if(count == marks.length) {
			b = true;
		}
		return b;
	}
	static int calTotal(int marks[]) {
		int sum = 0;
		for(int x : marks) {
			sum += x;
	}
		return sum;
}
	
static String findGrade(int marks[]) {
	String res = "";
	if(inPass(marks)) {
		res += "passed \n";
		int total = calTotal(marks);
		int avg = total / marks.length;
		res += "your total =" + total + "\n";
		res += "avg marks =" + avg + "\n";
		if(avg >= 75) {
			res += "you got distincation \n";
		}
		else if(avg >= 60) {
			res += "you got first class \n";
		}
			else if(avg >= 50) {
				res += "you got second class \n";
			}
			else{
				res += "you got third class \n";
			}
	}
		else {
			res += "you are failed & try again";
		}
		return res;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 5 sub marks");
	int marks[] = new int[5];
	for(int i = 0; i < marks.length;i++) {
		marks[i] = sc.nextInt();
	}
	System.out.println(findGrade(marks));
}
}



