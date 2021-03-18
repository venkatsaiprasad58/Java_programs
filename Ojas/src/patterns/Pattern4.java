package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int rows,columns;
		String res ="";
		for( rows = 5; rows >= 1; rows--)
		{
			for(columns = 5; columns >= 1; columns--)
			{
				res += rows+" ";
				
			}
			res += "\n";
			
		}
		System.out.println(res);


	}

}


//5 5 5 5 5 
//4 4 4 4 4 
//3 3 3 3 3 
//2 2 2 2 2 
//1 1 1 1 1 
