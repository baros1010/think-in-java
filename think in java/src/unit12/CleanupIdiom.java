package unit12;
class NeedsCleanup{
	private static long count=1;
	private final long id=count++;
	public void dispose(){
		System.out.println("NeedCleanup"+id+"dispose");
	}
	
}
class ConstructionException extends Exception{
	
}
class NeedsCleanup2 extends NeedsCleanup{
	public NeedsCleanup2()throws ConstructionException{
		
	}
}
public class CleanupIdiom {

	public static void main(String[] args) throws ConstructionException {
		// TODO 自動生成されたメソッド・スタブ
		NeedsCleanup nc1=new NeedsCleanup();
		try{
			
		}finally{
			nc1.dispose();
		}
		NeedsCleanup nc2=new NeedsCleanup();
		NeedsCleanup nc3=new NeedsCleanup();
		try{
			
		}finally{
			nc1.dispose();
			nc2.dispose();
		}
		try{
			NeedsCleanup2 nc4=new NeedsCleanup2();
			try{
				NeedsCleanup nc5=new NeedsCleanup();
				try{
					
				}finally{
					nc5.dispose();
				}
			}finally{
				nc4.dispose();
			}
		}catch(ConstructionException e){
			System.out.println(e);
		}
	}

}
