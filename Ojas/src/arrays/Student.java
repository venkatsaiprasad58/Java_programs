package arrays;

public class Student {
	static void liststudentMarks(int student[][]) {
		for(int i = 0; i < student.length; i++ ) {
			for(int j =0; j < student[i].length; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int student[][] = new int[3][4];
		int k = 0;
		for(int i = 0; i < student.length; i++ ) {
			for(int j = 0;j < student[i].length; j++) {
				student[i][j] = Integer.parseInt(args[k]);
				k++;
			}
		}
		
		liststudentMarks(student);
		

	}

}

//output - 2 dimensional array
//1 2 3 4 
//5 6 7 8 
//9 2 3 4 
