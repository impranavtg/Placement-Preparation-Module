class Solution {
    public int[][] merge(int[][] arr) {
        int m=arr.length,n=arr[0].length,k=0;
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int start=arr[0][0],end=arr[0][1];
        for(int[] i:arr){
            if(i[0]<=end)end=Math.max(end,i[1]);
            else{
                ans.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}