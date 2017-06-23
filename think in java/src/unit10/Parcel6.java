package unit10;

public class Parcel6 {
private void internalTracking(boolean b){
	if(b){
		class TrackingSlip{
			private String id;
			TrackingSlip(String s){
				id=s;
			}
			String getSlip(){return id;}
		}
		TrackingSlip ts=new TrackingSlip("s");
		String s=ts.getSlip();
	}
	//TrackingSlip ts=new TrackingSlip("s"); out of bound
}
public void track(){
	internalTracking(true);
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Parcel6 p=new Parcel6();
		p.track();
	}

}
