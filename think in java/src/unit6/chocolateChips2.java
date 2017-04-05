package unit6;

public class chocolateChips2 extends Cookie{
public chocolateChips2(){
	System.out.println("chocolateChips2");
}
public void chomp(){
	
	bite();
}
public static void main(String[] args){
	chocolateChips2 a=new chocolateChips2();
	a.chomp();
	a.bite();
}
}
