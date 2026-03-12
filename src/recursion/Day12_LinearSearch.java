package recursion;

public class Day12_LinearSearch {
	static int search(int[] arr,int target,int index) {
		if(index==arr.length)
			return -1;
		if(arr[index]==target) 
			return index;
			return search(arr,target,index+1);
		
	}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,4,5};
	int target=8;
	System.out.println(search(arr,target,0));
}
}
