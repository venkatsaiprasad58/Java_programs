package arrays;

import java.util.Scanner;

public class ThreeDimensionalArray {
	static void display(int college[][][]) {
		for(int i =0; i < college.length;i++) {
			for(int j = 0; j < college[i].length;j++) {
				for(int k = 0; k < college[i][j].length;k++) {
					System.out.println(college[i][j][k]);
				}
			}
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int college[][][] =  new int[2][2][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+college.length+" Branches info");
		for(int i = 0; i < college.length;i++) {
			for(int j =0;j < college[i].length;j++) {
				System.out.println(""+(j+1)+"student" + college[i][j].length+"submarks?");
				for(int k =0;k < college[i][j].length;k++) {
					college[i][j][k] = sc.nextInt();
				}
			}
		}
			display(college);
	}

}
