package unit15;

import java.util.EnumSet;
import java.util.Set;
import unit15.Watercolors.*;


public class WatercolorsSet {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<Watercolors> set1=EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
		Set<Watercolors> set2=EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
		System.out.print("set1:"+set1);
		System.out.print("set1:"+set2);
		//System.out.print("union"+union(set1,set2));
	}

}
