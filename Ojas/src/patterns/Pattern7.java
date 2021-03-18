package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		int rows,columns;
	
		String res ="";
		for( rows = 1; rows <= 5; rows++)
		{
			for(columns = rows; columns >= 1; columns--)
			{
				
				res += columns+" ";
				
			}
			res += "\n";
			
			
		}
		System.out.println(res);
	}

}

//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 

