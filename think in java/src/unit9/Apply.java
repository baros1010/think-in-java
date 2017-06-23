package unit9;

import java.util.Arrays;

class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){
		return input;
	}
}
class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}
public class Apply {
public static void process(Processor p,Object s){
	System.out.println(p.name());
	System.out.println(p.process(s));
}
public static String s="I am your father";
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
process(new Upcase(),s);
process(new Splitter(),s);
process(new Downcase(),s);
	}

}
