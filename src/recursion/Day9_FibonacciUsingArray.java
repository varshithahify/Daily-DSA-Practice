package recursion;

public class Day9_FibonacciUsingArray {
	static int array( int n) {
		if(n==0||n==1) {
			return n;}
			return array(n-1)+array(n-2);
		}
	
public static void main(String[] args) {
	int arr[]= {5,88,9,6,57,4,5,87,88};
	
	System.out.println(array(arr[87]));

	}
}
