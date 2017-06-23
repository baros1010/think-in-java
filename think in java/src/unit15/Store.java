package unit15;

import java.util.ArrayList;
import java.util.Random;

class product {
	private int id;
	private String description;
	private double price;

	public product(int id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
		System.out.println(toString());

	}

	public String toString() {
		return "id" + id + " " + "description" + description + " " + "price" + price;
	}

	public void priceChange(double change) {
		price = change++;
	}

	public static Generator<product> generator = new Generator<product>() {
		private Random rand = new Random(47);

		@Override
		public product next() {
			// TODO 自動生成されたメソッド・スタブ
			return new product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 100.0) + 0.99);
		}
	};

}

class shelf extends ArrayList<product> {
	public shelf(int nProduct) {
		Generators.fill(this, product.generator, nProduct);
	}
}
class Aisle extends ArrayList<shelf>{
	public Aisle(int nShelves,int nProduct){
		for (int i=0;i<nShelves;i++){
			add(new shelf(nProduct));
		}
	}
} 
class CheckoutStand{}
class Office{}
public class Store extends ArrayList<Aisle>{
	ArrayList<CheckoutStand> checkouts=new ArrayList<CheckoutStand>();
	private Office office =new Office();
	public Store(int nAisles, int nShelves,int nProduct){
		for(int i=0;i<nAisles;i++){
			add(new Aisle(nShelves,nProduct));
		}
	}
	public String toString(){
		StringBuilder result=new StringBuilder();
		for(Aisle a:this)
			for(shelf s:a)
				for(product p:s){
					result.append(p);
					result.append("\n");
			
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(new Store(13,11,1));
	}

}
