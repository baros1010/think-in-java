package paratise;
/**
 * 1.定义一个二维数组
 *2. 最外圈先设1
 *3.当中的值a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
 * 4.打印空格
 * @author firas
 *
 */
public class pasika2 {
	public static void main(String[] args) {
		for(int i=0;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print("8");
			}
			System.out.println(" ");
		}
	}
}
