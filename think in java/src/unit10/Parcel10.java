package unit10;

public class Parcel10 {
	public Destnation destination(final String dest,final float price) {
		return new Destnation(){
			private int cost;
			{
				cost =Math.round(price);
				if(cost>100)
					System.out.println("Over budget");
			}
			private String label=dest;
			//public String readLabel(){ }
			@Override
			public String readLabel() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return label;
			}
			
		};
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Parcel10 p=new Parcel10();
		Destnation d=p.destination("tasania", 101.39f);
	}

}
