package unit11;

import java.util.*;


import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CrossComtainerIteration {
	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet p=it.next();
			System.out.print(p.id()+":"+p+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		ArrayList<Pet> pets=Pets.arrayList(8);
		LinkedList<Pet> petsLL=new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS=new HashSet<Pet>(pets);
		TreeSet<Pet> petsTS=new TreeSet<Pet>(pets);
		display(pets.iterator());
		display(petsLL.iterator());
		display(petsHS.iterator());
		display(petsTS.iterator());
		
	}

}
