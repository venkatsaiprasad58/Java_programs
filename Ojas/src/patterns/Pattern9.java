package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		int rows,columns;
		
		for( rows = 1; rows <= 5; rows++) {
			for( columns = 1; columns <= 5; columns++) {
				if(rows==1||rows==5||columns==1||columns==5)
				System.out.print("*"+" ");
				else
					System.out.print(" "+ " ");
			}
			System.out.println();
		}
		
	}

}


//* * * * * 
//*       * 
//*       * 
//*       * 
//* * * * * 
