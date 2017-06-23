package unit14;

import java.util.List;
import java.util.Random;

public abstract class PetCreator {
	private Random rand=new Random(47);
	public abstract List<Class<? extends Pet>> types();
	public Pet randomPet(){
		int n=rand.nextInt(5);
		try{
			return types().get(n).newInstance();
		}catch(InstantiationException e){
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			// TODO ©“®¶¬‚³‚ê‚½ catch ƒuƒƒbƒN
			throw new RuntimeException(e);
		}
	}
	public Pet[] createArray(int size){
		Pet[] result=new Pet[size];
		for(int i=0;i<size;i++)
			result[i]=randomPet();
		return result;
		
	}
}
