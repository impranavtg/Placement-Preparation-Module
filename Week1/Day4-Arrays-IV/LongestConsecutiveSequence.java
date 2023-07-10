class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)return 0;
        HashSet<Integer> set=new HashSet<>();
        int count=1,max=-1;
        for(int i:arr)set.add(i);
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                count=1;
                int k=1;
                while(set.contains(arr[i]+k)){
                    count++;
                    k++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}