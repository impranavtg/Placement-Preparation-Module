class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length,n=arr[0].length;
        int low=0,high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/n,col=mid%n;
            if(arr[row][col]<target)low=mid+1;
            else if(arr[row][col]>target)high=mid-1;
            else return true;
        }
        return false;
    }
}