package unit12;

public class MutipleReturn {
	public static void f(int i){
		System.out.println("chean up");
		try{
			System.out.println("point 1");
			if(i==1)return;
			System.out.println("point 2");
			if(i==2)return;
			System.out.println("point 3");
			if(i==3)return;
			System.out.println("end");
			return;
		}finally{
			System.out.println("///////////");
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<4;i++){
			f(i);
		}
	}

}
