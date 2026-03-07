package recursion;

public class Day7_RecursionNumbers {
	static void Numbers(int n) {
		if (n==6)
		return ;
		System.out.println(n);
		Numbers(n+1);
	}
		public static void main(String[] args) {
			Numbers(1);
		}
}
