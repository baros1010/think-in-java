package paratise;

import java.util.Arrays;

public class maopaosort {
	
	public static void main(String[] args) {
		int[] a= {3,5,1,4,7,8,10,22,8,6};
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				   if(a[j] > a[j + 1]){    //把小的值交换到后面
	                     int temp = a[j];
	                     a[j] = a[j + 1];
	                     a[j + 1] = temp;
	                 }
			}
		}
		for(int b:a){
			System.out.println(b);
		}
		System.out.println(Arrays.toString(a));
	}
}
