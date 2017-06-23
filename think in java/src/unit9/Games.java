package unit9;

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers move" + moves);

		// TODO 自動生成されたメソッド・スタブ
		return ++moves != MOVES;
	}
}
class Chess implements Game{
	private int moves = 0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Checkers move" + moves);

		// TODO 自動生成されたメソッド・スタブ
		return ++moves != MOVES;
	}
	
}
class CheckFactory implements GameFactory{

	@Override
	public Game getGame() {
		// TODO 自動生成されたメソッド・スタブ
		return new Checkers();
	}
	
}
class ChessFactory implements GameFactory{

	@Override
	public Game getGame() {
		// TODO 自動生成されたメソッド・スタブ
		return new Chess();
	}}
public class Games {
public static void playgame(GameFactory fac){
	Game g=fac.getGame();
	while(g.move());
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		playgame(new ChessFactory());
		playgame(new CheckFactory());
	}

}
