package patterns;

public class Pattern18 {

	public static void main(String[] args) {
		String res ="";
		int i = 16;
		for(int rows = 1; rows < 5; rows++) {
			for(int columns = 1; columns < 5 ;columns++ ) {
				res += i+" ";
				i--;
			}
			res += "\n";
		}
		System.out.println(res);

	}

}

//16 15 14 13 
//12 11 10 9 
//8 7 6 5 
//4 3 2 1 