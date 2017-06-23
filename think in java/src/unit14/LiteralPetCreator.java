package unit14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
	public static final List<Class<? extends Pet>> allTypes = Collections
			.unmodifiableList(Arrays.asList(Pet.class, Dog.class, Rodent.class, Mutt.class, Pug.class,
					EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class));
	private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class),
			allTypes.size());

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println(types);
	}

	@Override
	public List<Class<? extends Pet>> types() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return types;
	}

}
