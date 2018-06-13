package paratise;

import java.util.Stack;

public class test12 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
//	  public String replaceSpace(StringBuffer str) {
//		  StringBuffer newstr=new StringBuffer();
//          
//		  for(int i=0;i<str.length();i++){
//			  char c= str.charAt(i);
//			  if(c==' '){
//				newstr.append("%20");
//			  }else{
//				  newstr.append(str.charAt(i));
//			  }
//           
//		  }
//		  return newstr.toString();
//	    }
	  public static void main(String args[]){
		  int[] a={1,24,7,9,11,21,99};
		  int flag=a[0];
		  for(int i=0;i<a.length;i++){
			  if(a[i]>flag){
				  flag=a[i];
			  }
		  }
		  System.out.println(flag);
	  }
}
