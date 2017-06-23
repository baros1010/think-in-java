package unit16;

import java.util.Arrays;

public class MutidimensionalObjectArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BerlliumSphere[][] spheres={
				{new BerlliumSphere(),new BerlliumSphere()},
				{new BerlliumSphere(),new BerlliumSphere(),new BerlliumSphere()},
				{new BerlliumSphere(),new BerlliumSphere(),new BerlliumSphere(),new BerlliumSphere()}
	};
		System.out.println(Arrays.deepToString(spheres));
	}
}
