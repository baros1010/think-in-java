package unit10;

public class Parcel7 {
public Contents contents(){
	return new Contents(){
		private int i=11;

		@Override
		public int value() {
			// TODO 自動生成されたメソッド・スタブ
			return i;
		}
	};
}
public static void main(String[] args){
	Parcel7 p=new Parcel7();
	Contents c=p.contents();
}
}
