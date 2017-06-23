package unit11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Cymric;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
public class ListFeatures {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand=new Random(47);
		List<Pet> pets=Pets.arrayList(7);
		System.out.println("1:"+pets);
		Hamster h=new Hamster();
		pets.add(h);
		System.out.println("2:"+pets);
		System.out.println("3:"+pets.contains(h));//是否包含此元素
		pets.remove(h);
		Pet p=pets.get(2);
		System.out.println("4:"+pets.indexOf(p));//发现所在位置索引编号
		Pet cymric =new Cymric();
		System.out.println("5:"+pets.indexOf(cymric));
		System.out.println("6:"+pets.remove(cymric));//boolean
		System.out.println("7:"+pets.remove(p));
		System.out.println("8:"+pets);
		pets.add(3, new Mouse());
		System.out.println("9:"+pets);//指定位置添加
		List<Pet> sub=pets.subList(1,4);
		System.out.println("sub:"+sub);
		System.out.println("10:"+pets.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sort:"+sub);//排序
		System.out.println("11:"+pets.containsAll(sub));
		Collections.shuffle(sub);//打乱顺序
		System.out.println("shuffle:"+sub);
		System.out.println("12:"+pets.containsAll(sub));
		List<Pet> copy=new ArrayList<Pet>(pets);
		sub=Arrays.asList(pets.get(1),pets.get(4));
		System.out.println("sub:"+sub);
		copy.retainAll(sub);
		System.out.println("13:"+copy);//有效交集
		copy=new ArrayList<Pet>(pets);
		copy.remove(2);
		System.out.println("14:"+copy);
		copy.removeAll(sub);
		System.out.println("15:"+copy);
		copy.set(1, new Mouse());
		System.out.println("16:"+copy);
		copy.addAll(2,sub);
		System.out.println("17:"+copy);
		System.out.println("18:"+copy.isEmpty());//是否为空
		pets.clear();
		System.out.println("19:"+pets);
		System.out.println("20:"+pets.isEmpty()) ;//是否为空
		pets.addAll(Pets.arrayList(4));
		System.out.println("21:"+pets);
		Object[] o=pets.toArray();
		System.out.println("22:"+o[3]);
		Pet[] pa=pets.toArray(new Pet[0]);
		System.out.println("23:"+pa[3].id());
	}

}
