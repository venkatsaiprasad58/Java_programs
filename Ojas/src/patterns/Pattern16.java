package patterns;

public class Pattern16 {

	public static void main(String[] args) {
		String res = "";
		for(int rows = 1 ;rows<=4;rows++) {
			for(int columns = 1; columns <= 4;columns++) {
				if(rows == 1||rows == 3)
					res += "1"+ " ";
				else
					res += "0"+" ";
			}
			res += "\n";
		}
		System.out.println(res);
		
	}

}

//1 1 1 1 
//0 0 0 0 
//1 1 1 1 
//0 0 0 0 