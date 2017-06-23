package unit15;

import java.awt.Color;

interface HasColor {
	Color getColor();
}

class Colored<T extends HasColor> {
	T item;

	Colored(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}

	Color color() {
		return item.getColor();
	}

}

class Dimension {
	public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor> {
	T item;

	ColoredDimension(T item) {
		this.item = item;

	}

	T getItem() {
		return item;
	}

	Color color() {
		return item.getColor();
	}
	int getX(){return item.x;}
	int getY(){return item.y;}
	int getZ(){return item.z;}
	
}
interface Weight{int weight();}
class Soild<T extends Dimension & HasColor&Weight>{
	T item;
	Soild(T item){
		this.item=item;
	}
	T getItem() {
		return item;
	}

	Color color() {
		return item.getColor();
	}
	int getX(){return item.x;}
	int getY(){return item.y;}
	int getZ(){return item.z;}
	int getWight(){ return item.weight();}
}
class Bounded extends Dimension implements HasColor,Weight{

	@Override
	public int weight() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 0;
	}

	@Override
	public Color getColor() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return null;
	}
	
}
public class BasicBounds {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Soild<Bounded> sd=new  Soild<Bounded>(new Bounded());
		sd.color();
		sd.getX();
	}

}
