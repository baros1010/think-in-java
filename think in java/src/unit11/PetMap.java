package unit11;

import java.util.HashMap;
import java.util.Map;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

public class PetMap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("My Cat", new Cat("Tom"));
		petMap.put("My Dog", new Dog("101"));
		petMap.put("My Hapster", new Hamster("Hapster"));
		System.out.println(petMap);
		Pet dog=petMap.get("My Dog");
		System.out.println(dog);
		System.out.println(petMap.containsKey("My Dog"));
		System.out.println(petMap.containsValue(dog));
		
	}

}
