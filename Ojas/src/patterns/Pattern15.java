package patterns;

public class Pattern15 {

	public static void main(String[] args) {
		String res = "";
		for(int rows = 1 ;rows<=5;rows++) {
			for(int columns = 1; columns <= 5;columns++) {
				if(columns == 1||columns == 3 || columns == 5)
					res += "1"+ " ";
				else
					res += "*"+" ";
			}
			res += "\n";
		}
		System.out.println(res);
		

	}

}
