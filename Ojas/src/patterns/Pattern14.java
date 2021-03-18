package patterns;

public class Pattern14 {

	public static void main(String args[]) {
		int rows,columns;
		for(rows = 1; rows <= 5; rows++) {
			for(columns = 1; columns >= rows; columns--) {
				System.out.println(rows);
			
			}
			System.out.println();
		}
	}
}

