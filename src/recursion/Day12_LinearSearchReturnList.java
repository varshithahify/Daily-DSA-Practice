package recursion;
import java.util.ArrayList;

public class Day12_LinearSearchReturnList {
		static ArrayList<Integer> linear(int[] arr,int target,int index) {
			ArrayList<Integer> list=new ArrayList<Integer>();

				if(index==arr.length) {
					return list;
				}
				if(arr[index]==target) {
					list.add(index);
				}
				ArrayList<Integer> ans=linear(arr ,target,index+1);
				list.addAll(ans);
				return ans;
					
		}
	 public static void main(String[] args) {
		int[] arr= {1,2,3,2,3,4,5,2};
		int target=2;
		System.out.println(linear(arr,target,0));
	}
	}


