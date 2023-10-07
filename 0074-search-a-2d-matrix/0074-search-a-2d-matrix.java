class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int low=0;
       int rows=matrix.length;
       int col=matrix[0].length-1;
            while(low<rows && col>=0){
                if(matrix[low][col]==target){
                    return true;
                }else if(matrix[low][col]<target){
                    low++;
                }else {
                    col--;
                }
            }
           return false;
    }
}