package unit11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typeinfo.pets.*;

public class MapOfList {
	public static Map<Person, List<? extends Pet>> petpeople = new HashMap<Person, List<? extends Pet>>();
	static {
		petpeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petpeople.put(new Person("Kate"), Arrays.asList(new Cat("Tom"), new Cat("haha"),new Dog("Margertte")));
		petpeople.put(new Person("Martin"), Arrays.asList(new Pug("I am your father"), new Cat("your daddy"),new Dog("pig")));
		petpeople.put(new Person("Jim"), Arrays.asList(new Rat("Rate"), new Rat("daddy")));
		petpeople.put(new Person("Luck"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
	}

	public static void main(String[] args) {
		System.out.println("People:"+petpeople.keySet());
		System.out.println("Pets:"+petpeople.values());
		for(Person p:petpeople.keySet()){
			System.out.println(p+"has: ");
			for(Pet pet:petpeople.get(p))
				System.out.println(" "+pet);
		}
		
	}
}
