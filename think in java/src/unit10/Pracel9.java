package unit10;

public class Pracel9 {
	public Destnation destnation(final String dest){
		return new Destnation(){
			private String label=dest; 
			@Override
			public String readLabel() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return label;
			}
			
		};
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Pracel9 p=new Pracel9();
		Destnation d=p.destnation("haha");
	}

}
