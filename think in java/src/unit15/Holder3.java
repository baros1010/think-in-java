package unit15;

import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

public class Holder3<T> {
	private T a;

	public Holder3(T a) {
		this.a = a;
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Holder3<Pet> h4 = new Holder3<Pet>(new Dog());
	//	h3.set("1"); error
	}

}
