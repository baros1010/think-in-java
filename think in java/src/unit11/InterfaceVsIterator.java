package unit11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class InterfaceVsIterator {
	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet p=it.next();
			System.out.print(p.id()+":"+p+" ");
		}
		System.out.println();
	}
	public static void display(Collection<Pet>pets){
		for(Pet p:pets)
			System.out.print(p.id()+":"+p+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Pet> petList=Pets.arrayList(8);
		Set<Pet> petSet=new HashSet<Pet>(petList);
		Map<String,Pet> petMap=new LinkedHashMap<String,Pet>();
		String []s=("haha,xixi,1,2"+"huhu,hehe,3,4").split(",");
		for(int i=0;i<s.length;i++)
			petMap.put(s[i], petList.get(i));
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
		
	}

}
