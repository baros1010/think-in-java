package paratise;

public class shuixianhua {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 for(int i=101;i<1000;i++){
	 int a=i%10;
	 int b=i/10%10;
	 int c=i/100;
	 if(a*a*a+b*b*b+c*c*c==i){
		 System.out.println(i);
		
	 }
	 
	 
 }
	}

}
