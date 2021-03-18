package patterns;

public class Pattern8 {

	public static void main(String[] args) {
	
		int rows,columns;
		int count = 1;
		String res ="";
		for( rows = 1; rows <= 5; rows++)
		{
			for(columns = 1; columns <= 5; columns++)
			{
				if(rows <= columns)
				res += rows+" ";
				
			}
			res += "\n";
			count++;
			
		}
		System.out.println(res);


	}

}


//1 1 1 1 1 
//2 2 2 2 
//3 3 3 
//4 4 
//5 


