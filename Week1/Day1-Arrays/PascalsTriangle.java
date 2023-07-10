class Solution {
    public List<List<Integer>> helper( List<List<Integer>> lists,int n,int x,int[] arr){
        if(n==x+1)return lists;
        int[] temp=new int[n+1];
        int k=0;
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        temp[k]=1;
        k++;
                for(int j=0;j<n-2;j++){
                    l1.add(arr[j]+arr[j+1]);
                    temp[k]=arr[j]+arr[j+1];
                      k++;
                }
        lists.add(l1);
        if(n==1)n+=2;
        else n+=1;
            return helper(lists,n,x,temp);
    }
    public List<List<Integer>> generate(int numRows) {
        int[] arr={};
        List<List<Integer>> lists = new ArrayList<>();
        List<List<Integer>> ans= helper(lists,1,numRows+1,arr);
        return ans;
    }
}