package unit11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
public class SimpleIteration {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Pet> pets=Pets.arrayList(12);
		Iterator<Pet> it=pets.iterator();
		while(it.hasNext()){
			Pet p=it.next();
			System.out.print(p.id()+":"+p+",");
		}
		System.out.println();
		for(Pet p:pets)
		System.out.print(p.id()+":"+p+",");
		System.out.println();
		it=pets.iterator();
		for(int i=0;i<6;i++){
			it.next();
			it.remove();
		}
		System.out.print(pets);
	}

}
