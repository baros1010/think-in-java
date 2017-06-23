package unit10;
interface Game{boolean move();}
interface GameFactory{Game  getGame();}
class Checkers implements Game{
private Checkers(){}
private int moves=0;
private static final int MOVES=3;
	@Override
	public boolean move() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Checkers move"+moves);
		return ++moves!=MOVES;
	}
	public static GameFactory factory=new GameFactory(){

		@Override
		public Game getGame() {
			// TODO 自動生成されたメソッド・スタブ
			return new Checkers();
		}};
	}
class Chess implements Game{
	private int moves=0;
	private static final int MOVES=10;
	@Override
	public boolean move() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Chess move"+moves);
		return ++moves!=MOVES;
	}
	public static GameFactory factory=new GameFactory(){

		@Override
		public Game getGame() {
			// TODO 自動生成されたメソッド・スタブ
			return new Chess();
		}};
	}
public class Games {
public static void get(GameFactory fact){
	Game g=fact.getGame();
	while(g.move());
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		get(Checkers.factory);
		get(Chess.factory);
	}

}
