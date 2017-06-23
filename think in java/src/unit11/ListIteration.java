package unit11;

import java.util.*;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIteration {

	public static void main(String[] args) {
		List<Pet> pets=Pets.arrayList(8);
		ListIterator<Pet> it=pets.listIterator();
		while(it.hasNext())
			System.out.print(it.next()+", "+it.nextIndex()+", "+it.previousIndex()+"; ");
		// TODO 自動生成されたメソッド・スタブ
		System.out.println();
		while(it.hasPrevious())
			System.out.print(it.previous().id()+" ");
		System.out.println();
		it=pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}

}
