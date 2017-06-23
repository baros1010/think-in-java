package unit10;

public class Pracel9 {
	public Destnation destnation(final String dest){
		return new Destnation(){
			private String label=dest; 
			@Override
			public String readLabel() {
				// TODO 自動生成されたメソッド・スタブ
				return label;
			}
			
		};
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pracel9 p=new Pracel9();
		Destnation d=p.destnation("haha");
	}

}
