package fun.hijklmn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Desc 两数之后返回下标 	
 * @author GuoFusong
 * @Datetime 2019年6月12日下午1:53:33
 */
public class TwoSum {

	private static int[] twoSum(int[] nums, int target) {
		
		if (nums == null || nums.length == 0) return null; 
		
		int[] ind = new int[2]; 
		
		Map<Integer,Integer> map = new HashMap<>(); 
		
		for (int i=0; i<nums.length; i++) {
			
			if (i == 0) {
				map.put(nums[i], i);
				continue;
			}
			
			Integer tempInd = map.get(target - nums[i]);
			
			if (tempInd != null) {
				ind[0] = tempInd;
				ind[1] = i;
				return ind;
			}
			
			map.put(nums[i], i);
			
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 23, 35, 45, 21, 32, 86, 48, 15, 65};
		
		int target = 66;
		
		int[] indArr = twoSum(arr, target);
		
		if (indArr != null) {
			System.out.println(indArr[0] + " , " + indArr[1]);
		}
		
	}
	
}
