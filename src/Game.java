import java.util.Scanner;
public class Game implements Player, Monster{
	static Scanner sc = new Scanner(System.in);
	static String choice = sc.nextLine();
	static Player myPlayer;
	static Monster myMonster;

	
	public Game (Player newPlayer, Monster newMonster) {
		myPlayer = newPlayer;
		myMonster = newMonster;

	
	}
//	public static void setPlayer(Player myPlayer) {
//		Game.myPlayer = myPlayer;
//	}
//	public static void setMonster(Monster myMonster) {
//		Game.myMonster = myMonster;
//	}

	
	
	@Override
	public int M_health(int a) {

		return myMonster.M_health(a);
	

		
		
	}
	@Override
	public int M_attack(int b) {

		return myMonster.M_attack(b);
		

		
	}
	@Override
	public int M_speed(int c) {
	
		return myMonster.M_speed(c);
		

		
	}
	@Override
	public int M_luck(int d) {

		return myMonster.M_luck(d);
	

		
	}
	@Override
	public int P_health(int e) {
		
		return myPlayer.P_health(e);
	

		
	}
	@Override
	public int P_attack(int f) {
	
		return myPlayer.P_attack(f);
		

	}
	@Override
	public int P_speed(int g) {
		
		return myPlayer.P_speed(g);
	

	}
	@Override
	public int P_luck(int h) {
		return myPlayer.P_luck(h);
		

	}
	public static void Combat(Player newPlayer, Monster newMonster ) {
		
		
		newPlayer.P_health(10);
		newPlayer.P_attack(3);
		newPlayer.P_luck(8);
		newPlayer.P_speed(3);
		newMonster.M_attack(2);
		newMonster.M_health(10);
		newMonster.M_luck(1);
		newMonster.M_speed(1);
		System.out.println(("hello, this is a game"));
		if (choice == "A") {
			int finalM = (newMonster.M_health(10) - newPlayer.P_attack(3));
			System.out.println("Your attack hit! The monster lost " + finalM + " health.");
		}
		else if (choice == "F") {
			System.out.println("The entrance caved in, remember? The monster kills you. Game over.");
		}
		else if (choice == "Q") {
			System.out.println("Thanks for playing!");
		}
	}


	public static void main (String[] args) {
		System.out.println(("hello, this is a game"));
		System.out.println("You enter a dark cave. Suddenly, the cave entracne caves in, and you hear a roar. You see a monster and draw your sword.");
		Monster theMonster = new Game(myPlayer,myMonster);
		Player thePlayer = new Game(myPlayer,myMonster);
		System.out.println((myPlayer));
		System.out.println(("Will you flee or attack? (Enter A for attack or F for flee): " + choice));
		Combat(thePlayer, theMonster);

		
		
		
		
	}
	
	
		
		
		
		
	}


