package unit15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob {
}

class Fnorke {
}


class Quark<Q> {
}

class Particle<POSITION, MOMENTUM> {
}

public class LostInformation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Frob> list=new ArrayList<Frob>();
		Map<Frob,Fnorke> map=new HashMap<Frob,Fnorke>();
		Quark<Fnorke> quark=new Quark<Fnorke>();
		Particle<String,Double> d=new Particle<String,Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(d.getClass().getTypeParameters()));
	}

}
