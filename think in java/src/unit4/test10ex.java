package unit4;

public class test10ex {
	public static void main(String[] args) {
		String[] arr1,arr2;
		int sum=0;
		for(int i=10;i<100;i++){
			for(int j=i+1;j<100;j++){
				int a=i*j;
				if(a<1000||a>9999){
					continue;
				}
				arr1=String.valueOf(a).split("");
				//System.out.println(arr1);
				arr2=(String.valueOf(i)+String.valueOf(j)).split("");
				  java.util.Arrays.sort(arr1);
				 // System.out.println(arr1);
				java.util.Arrays.sort(arr2);
				if(java.util.Arrays.equals(arr1, arr2)){
					sum++;
					   System.out.println("第" + sum + "组: " + i + "*" + j + "="
	                            + a);
					
				}
			}
			
			
		}
		System.out.println("共找到" + sum + "组吸血鬼数");
	}
}
