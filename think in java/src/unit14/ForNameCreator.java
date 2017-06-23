package unit14;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>>types=new ArrayList<Class<? extends Pet>>();
	private static String [] typeNames={
			"unit14.Mutt",
			"unit14.Pug",
			"unit14.EgyptianMau",
			"unit14.Manx",
			"unit14.Cymric",
			"unit14.Rat",
			"unit14.Mouse",
			"unit14.Hamster"
	} ;
	@SuppressWarnings("unchecked")
	private static void loader(){
		for(String name:typeNames)
			try {
				types.add((Class<? extends Pet>)Class.forName(name));
			} catch (ClassNotFoundException e) {
				// TODO 自動生成された catch ブロック
				throw new RuntimeException(e);
			}
	}
	static {loader();}
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO 自動生成されたメソッド・スタブ
	
		return types;
	}

}
