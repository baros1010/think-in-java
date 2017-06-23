package unit11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInterence {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Snow> snow1=Arrays.asList(new Slush(),new Crusty(),new Powder());
		List<Snow> snow2=Arrays.asList(new Light(),new Heavy());
		List<Snow> snow3=Arrays.asList();
		Collections.addAll(snow3, new Light(),new Heavy());
	}

}
