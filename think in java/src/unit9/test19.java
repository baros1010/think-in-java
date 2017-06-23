package unit9;

import java.util.Random;

interface mygame{
	void test();
	}
interface myfactory{
	mygame mytest();
}
class coin implements mygame{
	Random rand =new Random(47);
	@Override
	public void test() {
		// TODO 自動生成されたメソッド・スタブ
		int i=rand.nextInt(1);
		System.out.println(i);
	}}
class coinfactory implements myfactory{

	@Override
	public mygame mytest() {
		// TODO 自動生成されたメソッド・スタブ
		return new coin();
	}
	}
class shaizi implements mygame{
	Random rand =new Random(47);
	@Override
	public void test() {
		// TODO 自動生成されたメソッド・スタブ
		int i=rand.nextInt(5);
		System.out.println(i);
	}}
class shaizifactory implements myfactory{

	@Override
	public mygame mytest() {
		// TODO 自動生成されたメソッド・スタブ
		return new shaizi();
	}}
public class test19 {
public static void playss(myfactory my){
	mygame m=my.mytest();
	m.test();
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
playss(new shaizifactory());
playss(new coinfactory());
	}

}
