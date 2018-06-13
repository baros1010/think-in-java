package paratise;

public class Solution {
/**
 * 二进制1的个数最优解法
 * @param n
 * @return
 */
	public int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);
		}
		return count;
	}

	// public static int count=0;
	// public int NumberOf1(int n) {
	//
	// if(n>0){
	// while(n/2!=0||n==1){
	// if(n%2==0){
	// n=n/2;
	//
	// }else {
	// count++;
	// n=n/2;
	//
	// }
	// }
	// }
	// return count;
	// }
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Solution s = new Solution();
		System.out.println(s.NumberOf1(39));
	}

}
