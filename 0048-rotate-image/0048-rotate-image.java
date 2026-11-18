class Solution {
    public void rotate(int[][] matrix) {

        /*
        for 90 degre rotate follow tgis two steps
        1. find the transpose of matrix 
        2. rotate the row
         */
        int n=matrix.length;
         //1 . finding transpose of matrix
         for(int i=0;i<n;i++)
         {
            for(int j=i+1;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
         }
         //2. roate row 
         //its same as rotating 1d array traverse aech row and reverse using 2 pointer
         for(int i=0;i<n;i++)
         {
            int left=0;
            int right=n-1;
            while(left<right)
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
         }
        
    }
}