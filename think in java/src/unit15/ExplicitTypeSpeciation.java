package unit15;

import java.util.List;
import java.util.Map;

import typeinfo.pets.Person;
import typeinfo.pets.Pet;

public class ExplicitTypeSpeciation {
	static void f(Map<Person, List<Pet>> map){}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		f(New.<Person,List<Pet>>map());
	}

}
