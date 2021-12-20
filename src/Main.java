
public abstract class Main extends Game implements Player, Monster{

		

	public Main(Player newPlayer, Monster newMonster) {
		super(newPlayer, newMonster);
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
//		Player p = new Game(myPlayer, myMonster);
//		Monster m = new Game(myPlayer, myMonster);
		System.out.println(("hello, this is a game"));
		System.out.println("You enter a dark cave. Suddenly, the cave entrance caves in, and you hear a roar. You see a monster and draw your sword.");
	
		
		System.out.println(("Will you flee or attack? (Enter A for attack or F for flee): " + choice));
		Combat();

		
		
		
		
	}
}
