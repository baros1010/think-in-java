package unit11;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

class PetSequeue{
	protected Pet[] pets=Pets.createArray(8);
}
public class Non extends PetSequeue{
	public Iterator<Pet> iterator(){
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
			}};
	}
public static void main(String[] args){
	Non n=new Non();
	InterfaceVsIterator.display(n.iterator());
}	

}
