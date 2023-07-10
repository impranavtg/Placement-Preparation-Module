class Solution {
    public void setZeroes(int[][] matrix) {
        boolean flagRow=false,flagCol=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(i==0)flagRow=true;
                    if(j==0)flagCol=true;
                    if(i!=0 && j!=0){
                        matrix[0][j]=0;
                        matrix[i][0]=0;
                    }
                }
            }
        }
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[i].length-1;j>=0;j--){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
                if(flagRow && i==0){
                    matrix[0][j]=0;
                }
                if(flagCol && j==0){
                    matrix[i][0]=0;
                }
            }
        }      
    }
}