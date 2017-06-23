package unit11;

import java.util.LinkedList;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeature {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LinkedList<Pet> pets=new LinkedList<Pet>(Pets.arrayList(5));
		System.out.println(pets);
		
		System.out.println("frist:"+pets.getFirst());
		//获取第一个元素
		System.out.print("element:"+pets.element());
		//获取第一个元素
		System.out.println("peek:"+pets.peek());
		//获取第一个元素
		System.out.println("remove："+pets.remove());//删除第一个元素
		System.out.println("remove："+pets.removeFirst());//删除第一个元素
		System.out.println("poll："+pets.poll());
		System.out.println(pets);
		pets.addFirst(new Rat());
		System.out.println(pets);
		pets.offer(Pets.randomPet());
		System.out.println("add offer()"+pets);
		pets.add(Pets.randomPet());
		System.out.println("add "+pets);
		pets.addLast(Pets.randomPet());
		System.out.println("add last() "+pets);
		pets.add(2, Pets.randomPet());
		System.out.println("add "+pets);
	}

}
