class Solution {
    public boolean binarySearch(int[] arr,int low,long x){
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x)return true;
            else if(arr[mid]>x)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    
    public List<List<Integer>> fourSum(int[] arr, int target) {        
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
                long temp=(long)arr[i]+(long)arr[j];
                 int front=j+1,back=arr.length-1;
                        while(front<back){
                        if(arr[front]+arr[back]<(long)target-temp)front++;
                        else if(arr[front]+arr[back]>(long)target-temp)back--;
                        else{
                            List<Integer> list=new ArrayList<>();
                            list.add(arr[i]);
                            list.add(arr[j]);
                            list.add(arr[front]);
                            list.add(arr[back]);
                            ans.add(list);
                            while(front<back && arr[front]==list.get(2))front++;
                            while(front<back && arr[back]==list.get(3))back--;
                        }    
                    }
                    while(j+1<arr.length && arr[j+1]==arr[j])j++;
                }
                   while(i+1<arr.length && arr[i+1]==arr[i])i++;
            }
        
        return ans;
    }
}