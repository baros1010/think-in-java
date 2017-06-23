package unit13;

import java.util.Formatter;

public class Receipt {
	private double total=0;
	private Formatter f=new Formatter(System.out);
	public void printTitle(){
		f.format("%-15s %5s %10s\n", "Item","Qty","Price");
		f.format("%-15s %5s %10s\n", "---","---","----");
	}
	public void print(String name,int qty,double price){
		f.format("%-15.15s %5d %10.2f\n", name,qty,price);
		total=price++;
		
	}
	public void printTotal(){
		f.format("%-15s %5s %10.2f\n", "Tax","",total*0.6);
		f.format("%-15s %5s %10s\n", "","","----");
		f.format("%-15s %5s %10.2f\n", "total","",total*1.6);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Receipt rec=new Receipt();
		rec.printTitle();
		rec.print("tom", 1, 11.2);
		rec.print("Jerry", 2, 3.14);
		rec.printTotal();
	}

}
