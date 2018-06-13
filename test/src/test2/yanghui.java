package test2;

public class yanghui {

		 public static void main(String[] args) {
		        int [][] a = new int[5][5];
		        for (int i = 0 ; i < 4 ; i++) {
		            a[i][0] = 1;
		            a[i][i] = 1;
		        }
		         
		        for (int i = 1 ; i < 4 ; i ++) {
		            for (int j = 1; j < i ; j++) {
		                a[i][j] = a[i-1][j-1] + a[i-1][j];
		            }
		        }
		        for (int i = 0; i < 4 ; i++) {
		            for (int j = 0; j < 4-i;j++) {
		                System.out.print(" ");
		            }
		            for (int k = 0; k < 4;k++) {
		                if (a[i][k] != 0) {
		                    System.out.print(a[i][k]+" ");
		                }
		                 
		            }
		            System.out.println();
		        }
		    }
			
	}

