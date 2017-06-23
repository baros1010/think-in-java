
public class test {
    String str=new String("hello");
    char[]ch={'a','b'};
    public static void main(String args[]){
    	test ex=new test();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
//    public String change(String str){
//    	str="hahaha";
//    	return str;
//      
//    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}
