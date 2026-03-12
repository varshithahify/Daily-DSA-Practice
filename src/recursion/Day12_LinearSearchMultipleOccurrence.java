package recursion;

import java.util.ArrayList;

public class Day12_LinearSearchMultipleOccurrence {
	static ArrayList<Integer> linear(int[] arr,int target,int index,ArrayList<Integer> list) {
		if(index==arr.length)
			return list;
			if(arr[index]==target)
			list.add(index);
			return linear(arr,target,index+1,list);
	}
 public static void main(String[] args) {
	int[] arr= {1,2,3,2,3,4,5,2};
	int target=2;
	ArrayList<Integer> result=linear(arr,target,0,new ArrayList<>());
	System.out.println(result);
}
}
