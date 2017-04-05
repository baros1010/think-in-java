package unit4;

public class test4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=1;i<100;i++){
			boolean flg=false;
				for(int j=2;j<i;j++){
					
					if(i%j==0){
					flg=true;
						break;
						
					}
					
					
				}
				if(!flg){
					System.out.println(i);
				}
				
			
			
			
		}

	}

}
