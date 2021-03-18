package patterns;

public class pattern2 {

	public static void main(String[] args) {
		int rows,columns;
	
		String res ="";
		for( rows = 1; rows <= 5; rows++)
		{
			for(columns = 1; columns <= rows; columns++)
			{
				res += rows+" ";
				
			}
			res += "\n";
			
			
		}
		System.out.println(res);
	}

}

//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 

