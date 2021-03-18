package oops;
import java.util.*;
class Dice {
	int faceValue;
	void roll() {
		Random r = new Random();
		faceValue = r.nextInt(6) + 1;
	}
	
}
class Player {
	String pName;
	int pValue;
	void accept(String name) {
		pName = name;
		
	}
	void throwDice(Dice d1,Dice d2) {
		d1.roll();
		d2.roll();
		pValue = d1.faceValue + d2.faceValue;
		System.out.println(pValue+ " = "+ d1.faceValue +"+"+d2.faceValue);
	}
	
}
public class DiceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice d1 = new Dice();
		Dice d2  = new Dice();
		
		Player p1 = new Player();
		Player p2 = new Player();
		System.out.println("Enter the first player name");
		p1.accept(sc.next());
		System.out.println("Enter the second player name");
		p2.accept(sc.next());
		
		p1.throwDice(d1, d2);
		p2.throwDice(d1, d2);
		
		String res = "";
		if(p1.pValue > p2.pValue) {
			res = p1.pName + " Wins the game";
		}
		else if(p2.pValue > p1.pValue) {
			res = p2.pName + " Wins the game";
		}
		else {
			res = "play again";
		}
		System.out.println(res);

	}

}
