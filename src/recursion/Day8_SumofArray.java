package recursion;

public class Day8_SumofArray {
	static int arraySum(int arr[], int n) {
		if(n==0)
			return 0;
		return arr[n-1]+arraySum(arr, n-1);
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	System.out.println(arraySum(arr,arr.length));
}
}
