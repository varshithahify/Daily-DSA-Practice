package recursion;

public class Day11_CountSteps {
	static int steps(int n) {
		if(n==0)
			return 0;
		if(n%2==0) {
			return 1+steps(n/2);
		}
		else
			return 1+steps(n-1);
	}
public static void main(String[] args) {
	int num=19;
	System.out.println(steps(num));
}

}
