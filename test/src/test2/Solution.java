package test2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public  int Fibonacci(int n) {
		if(n==1||n==2){
            return 1;
        }else
          return  Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args){
    	List<Long> list=new ArrayList<Long>();
        Solution a=new Solution();
        for(int j=1;j<10;j++){
        	long i=a.Fibonacci(j);
            list.add(i);
        }
        System.out.println(list);
        
    }
}