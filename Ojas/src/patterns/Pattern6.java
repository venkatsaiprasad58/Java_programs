package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int rows,columns;
		String res ="";
		for( rows = 5; rows >= 1; rows--)
		{
			for(columns = 5; columns >= rows; columns--)
			{
				res += rows+" ";
				
			}
			res += "\n";
			
		}
		System.out.println(res);


	}

}
//
//5 
//4 4 
//3 3 3 
//2 2 2 2 
//1 1 1 1 1 