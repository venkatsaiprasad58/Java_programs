package patterns;

public class Pattern10 {
	public static void main(String[] args) {
		int rows,columns;
		String res ="";
		for( rows = 1; rows <= 5; rows++)
		{
			for(columns = 1; columns <= rows; columns++)
			{
				res += "*"+" ";
				
			}
			res += "\n";
			
		}
		System.out.println(res);
	}

}

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
