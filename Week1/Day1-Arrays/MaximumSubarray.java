class Solution {
    public int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE,curr_max=0;
        for(int i=0;i<arr.length;i++){
            if(curr_max<0)curr_max=0;
            curr_max+=arr[i];
            max=Math.max(max,curr_max);
        }
        return max;
        }
}