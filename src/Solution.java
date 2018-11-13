import java.util.*;
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length<3) return result;
        Arrays.sort(nums);
        ArrayList<Integer> temp = null;
        for(int i =0 ; i<nums.length ; i++)
        {
        	if(i>0 && nums[i]==nums[i-1]) continue;  //îªù–èdï°
        	int high = nums.length-1;
        	int low = i+1;
        	while(low < high)
        	{
        		int sum= nums[i]+ nums[high]+ nums[low];
        		if(sum==0)
        		{
        			temp = new ArrayList<Integer>();
        			temp.add(nums[i]);
        			temp.add(nums[high]);
        			temp.add(nums[low]);
        			result.add(temp);
        			while(low<high && nums[low]==nums[low+1]) low++;		//îªù–èdï°
        			while(low+1<high && nums[high]==nums[high-1]) high--;	//îªù–èdï°
        		}
        		else if(sum>0)	high--;
        						low++;
        	}
        }
        return result;
    }
}
