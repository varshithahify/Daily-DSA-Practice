package recursion;

public class Day7_RecursionSum {
	static int Sum(int n) {
		if(n==0)
			return 0;
		return n+Sum(n-1);
	}
public static void main(String[] args) {
	System.out.println(Sum(5));
}
}
