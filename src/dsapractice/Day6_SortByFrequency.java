package dsapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Day6_SortByFrequency {
	 public ArrayList<Integer> sortByFreq(int arr[]) {
	        // add your code here
	        HashMap<Integer, Integer> map = new HashMap<>();
	            for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        ArrayList<Integer> list = new ArrayList<>();
	        for (int num : arr) {
	            list.add(num);
	        }

	        Collections.sort(list, (a, b) -> {
	            if (!map.get(a).equals(map.get(b))) {
	                return map.get(b) - map.get(a);
	            }
	                return a - b;
	        });

	        return list;
	    }
	}

