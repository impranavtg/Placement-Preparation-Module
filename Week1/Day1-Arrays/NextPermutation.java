class Solution {
    public void nextPermutation(int[] arr) {
    int index=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                index=i-1;
                break;
            }
        }
        if(index==-1){
            Arrays.sort(arr);    
        }
        else{
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[index]){
               int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        int k=0;        
       for(int i=index+1;i<=(index+arr.length)/2;i++){
           int temp=arr[i];
           arr[i]=arr[arr.length-1-k];
           arr[arr.length-1-k]=temp;
           k++;
       }
    }
        
        
    }
}