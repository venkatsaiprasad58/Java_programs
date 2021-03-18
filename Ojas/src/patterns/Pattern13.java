package patterns;

public class Pattern13 {
	public static void main(String[] args)
	{
		String res ="";
		int rows,columns,count = 1;

		for( rows = 0; rows < 5; rows++)
		{
			for(columns = 5; columns > 1 ; columns--)
			{
				res += " ";
			}
			for(columns = 0; columns <= rows; columns++) {
				res += columns + " ";
				count++;
			}
			
			res += "\n";
		}
		System.out.println(res);
		
		

	}

}


//0 
//0 1 
//0 1 2 
//0 1 2 3 
//0 1 2 3 4 

