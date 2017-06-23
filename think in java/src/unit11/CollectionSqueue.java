package unit11;

import java.util.AbstractCollection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionSqueue extends AbstractCollection<Pet>{
	private Pet[] pets =Pets.createArray(8);
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CollectionSqueue c=new CollectionSqueue();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}

	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>(){
			private int index=0;
			@Override
			public boolean hasNext() {
				// TODO 自動生成されたメソッド・スタブ
				return index<pets.length;
			}

			@Override
			public Pet next() {
				// TODO 自動生成されたメソッド・スタブ
				return pets[index++];
			}
			
		};
		// TODO 自動生成されたメソッド・スタブ
	
	}

	@Override
	public int size() {
		// TODO 自動生成されたメソッド・スタブ
		return pets.length;
	}

}
