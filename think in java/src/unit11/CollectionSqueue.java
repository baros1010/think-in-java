package unit11;

import java.util.AbstractCollection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionSqueue extends AbstractCollection<Pet>{
	private Pet[] pets =Pets.createArray(8);
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return index<pets.length;
			}

			@Override
			public Pet next() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return pets[index++];
			}
			
		};
		// TODO �����������ꂽ���\�b�h�E�X�^�u
	
	}

	@Override
	public int size() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return pets.length;
	}

}
