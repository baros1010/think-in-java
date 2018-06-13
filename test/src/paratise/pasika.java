package paratise;
/**
 * 1.定义一个二维数组
 *2. 最外圈先设1
 *3.当中的值a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
 * 4.打印空格
 * @author firas
 *
 */
public class pasika {
	public static void main(String[] args) {
		int[][] a = new int[6][6];
		for (int i = 0; i < 6; i++) {
			a[i][0] = 1;
			a[i][i] = 1;
		}
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}

		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				//System.out.println(" ");
//			}
			   for (int i = 0; i <6 ; i++) {
		            for (int j = 0; j < 6-i;j++) {
		                System.out.print(" ");
		            }
			for (int k = 0; k < 6; k++) {
				if (a[i][k] != 0) {
					System.out.print(a[i][k] + " ");
				}

			}
			System.out.println();
		}
	}
}
