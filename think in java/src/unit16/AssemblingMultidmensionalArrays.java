package unit16;

public class AssemblingMultidmensionalArrays {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer[][] a;
		a=new Integer[3][];
		for(int i=0;i<a.length;i++){
			a[i]=new Integer[3];
			for(int j=0;j<a[i].length;j++){
				a[i][j]=i*j;
				
				System.out.println(a[i][j]);
			}
		
		}
		
	}

}
