package unit12;
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}
public class Human {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			throw new Sneeze();
		}catch(Sneeze e){
			System.out.println("Sneeze");
		}catch(Annoyance e){
			System.out.println("haha");
		}
		try{
			throw new Sneeze();
		}catch(Annoyance e){
			System.out.println("xixi");
		}
	}

}
