package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int rows,columns;
		String res ="";
		for( rows = 1; rows <= 5; rows++)
		{
			for(columns = 1; columns <= rows; columns++)
			{
				res += columns+" ";
				
			}
			res += "\n";
			
		}
		System.out.println(res);
	}
}


//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 