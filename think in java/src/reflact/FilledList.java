package reflact;

import java.util.ArrayList;
import java.util.List;

class CountInteger {
	private static long count;
	private final long id = count++;

	public String toString() {
		return Long.toString(id);
	}
}

public class FilledList<T> {
	private Class<T> type;

	public FilledList(Class<T> type) {
		this.type = type;
	}

	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++)
				result.add(type.newInstance());
		} catch (InstantiationException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		FilledList<CountInteger> fl=new FilledList<CountInteger>(CountInteger.class);
		System.out.println(fl.create(15));

	}

}
