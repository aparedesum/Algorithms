//https://leetcode.com/problems/toeplitz-matrix/description/
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;   
        if(n==1 || m ==1) return true;        
        int i = 0;       
        while(i+1<n){
            int k = i;
            int j = 0;
            while(j+1<m){
                if(matrix[k][j] == matrix[k+1][j+1]){
                    j++;
                } else { 
                    return false; 
                }
            }             
            i++;
        }        
        return true;        
    }
}
