package recursion;

import java.util.Arrays;

public class Day19_SelectionSort {
	static void selection(int[] arr,int r,int c,int max) {
		if(r==0) {
			return;
		}
		if(c<=r) {
		if(arr[c]>arr[max]) {
			selection(arr,r,c+1,c);
		}
		else {
			selection(arr,r,c+1,max);
		}
	}
		else {
			int temp=arr[max];
			arr[max]=arr[r];
			arr[r]=temp;
			selection(arr,r-1,0,0);
		}
}
	
public static void main(String[] args) {
	int[] arr= {5,3,4,1,2};
	selection(arr,arr.length-1,0,0);
	System.out.println(Arrays.toString(arr));
}
}
