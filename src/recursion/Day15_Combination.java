package recursion;

import java.util.ArrayList;
import java.util.List;

public class Day15_Combination {
	static void combine(int arr[],int index,List<Integer> current) {
		if(current.size()==2) {
			System.out.println(current);
			return;
		}
		for(int i=index;i<arr.length;i++) {
			current.add(arr[i]);
			combine(arr,i+1,current);
			current.remove(current.size()-1);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		combine(arr,0,new ArrayList<>());
	}
}

