package unit15;

import java.util.Arrays;
import java.util.List;

public class ComplierIntelligence {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		List<? extends Fruit> listss=Arrays.asList(new Apple());
		Apple a=(Apple)listss.get(0);
		listss.contains(new Apple());
	}

}
