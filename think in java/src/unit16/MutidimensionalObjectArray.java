package unit16;

import java.util.Arrays;

public class MutidimensionalObjectArray {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BerlliumSphere[][] spheres={
				{new BerlliumSphere(),new BerlliumSphere()},
				{new BerlliumSphere(),new BerlliumSphere(),new BerlliumSphere()},
				{new BerlliumSphere(),new BerlliumSphere(),new BerlliumSphere(),new BerlliumSphere()}
	};
		System.out.println(Arrays.deepToString(spheres));
	}
}
