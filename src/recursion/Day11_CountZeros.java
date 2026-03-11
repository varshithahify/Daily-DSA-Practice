package recursion;

public class Day11_CountZeros {
	static int count(int n) {
		if(n==0)
			return 0;
		int digit=n%10;
		if(digit==0) {
			return 1+count(n/10);
		}
		else
			return count(n/10);
	}
public static void main(String[] args) {
	int num=120000202;
	System.out.println(count(num));
}
}
