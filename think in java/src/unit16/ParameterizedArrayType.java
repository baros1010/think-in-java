package unit16;

class ClassParameter<T> {
	public T[] f(T[] arg) {
		return arg;
	}
}

class MethodParameter {
	public static <T> T[] f(T[] arg) {
		return arg;
	}
}

public class ParameterizedArrayType {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Integer[] ints={1,2,3,4,5};
			Integer[] ints2=new ClassParameter<Integer>().f(ints);
	}

}
