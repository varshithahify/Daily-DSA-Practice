package recursion;

import java.util.ArrayList;
import java.util.List;

public class Day13_LeetcodeSubset {
 public List<List<Integer>> subsets(int[] nums){
	 List<List<Integer>> result=new ArrayList<>();
	 helper(0,nums,new ArrayList<>(),result);
	 return result;
	 }
 void helper(int index,int[] nums,List<Integer> current,List<List<Integer>> result) {
	 if(index==nums.length) {
		 result.add(new ArrayList<>(current));
		 return;
	 }
	 current.add(nums[index]);
	 helper(index+1,nums,current,result);
	 current.remove(current.size()-1);
	 helper(index+1,nums,current,result);

 }
}
