package unit17;

import java.lang.reflect.InvocationTargetException;

public class S2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			SpringDetecter.test(G2.class);
		} catch (NoSuchMethodException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	}

}
