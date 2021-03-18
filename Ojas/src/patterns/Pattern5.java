package patterns;

public class Pattern5 {
	public static void main(String[] args) {
		int rows,columns;
		String res ="";
		for( rows = 5; rows >= 1; rows--)
		{
			for(columns = 5; columns >= 1; columns--)
			{
				res += columns+" ";
				
			}
			res += "\n";
			
		}
		System.out.println(res);


	}

}


//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 