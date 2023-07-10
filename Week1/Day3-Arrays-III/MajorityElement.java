class Solution {
    public int majorityElement(int[] arr) {
        int candidate=arr[0],count=0;
        for(int i:arr){
            if(i==candidate)count++;
            else if(count==0)candidate=i;
            else count--;
        }
        return candidate;
    }
}