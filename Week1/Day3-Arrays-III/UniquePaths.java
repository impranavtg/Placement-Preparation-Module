class Solution {
    public int helper(int[][] dp,int i,int j,int m,int n){
        
        if(i==m-1 || j==n-1)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
       return dp[i][j]=helper(dp,i+1,j,m,n)+helper(dp,i,j+1,m,n);
        }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)Arrays.fill(dp[i],-1);
        return helper(dp,0,0,m,n);
    }
}