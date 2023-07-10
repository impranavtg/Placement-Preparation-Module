import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }
            else{
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
        }
        return ans;
    }
}