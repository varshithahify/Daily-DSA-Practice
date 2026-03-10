package recursion;

public class Day10_Pallindrome {
	static int reverse=0;
	static int pallindrome(int n) {
		if(n==0) 
			return reverse;
			
		int rem=n%10;
		reverse= reverse*10+rem;
				return pallindrome(n/10);
		
	}
public static void main(String[] args) {
	int n=121;
	if(n==pallindrome(n))
		System.out.println("pallindrome");
	else
		System.out.println("not pallindrome");
	
}
}
