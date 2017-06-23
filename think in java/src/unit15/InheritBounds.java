package unit15;

import java.awt.Color;

class HoldItem<T>{
	T item;
	HoldItem(T item){
		this.item=item;
	}
	T getItem(){return item;}
}
class Colored2<T extends HasColor>extends HoldItem<T>{

	Colored2(T item) {
		super(item);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	Color color(){return item.getColor();}
	
}
class ColoredDimension2<T extends Dimension & HasColor>extends HoldItem<T>{

	ColoredDimension2(T item) {
		super(item);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	int getX(){return item.x;}
	int getY(){return item.y;}
	int getZ(){return item.z;}
	}


class Soild2<T extends Dimension & HasColor&Weight>extends HoldItem<T>{

	Soild2(T item) {
		super(item);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	int weight(){return item.weight();}
	}
public class InheritBounds {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
