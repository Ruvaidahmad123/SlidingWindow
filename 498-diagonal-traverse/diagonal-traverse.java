class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row=0;
        int col=0;
        int dir=0;
        int m=mat.length;
        int n=mat[0].length;
        int ans[]=new int[m*n];
        int idx=0;
        while(idx<m*n){
            ans[idx++]=mat[row][col];
            if(dir==0){
                if(col==n-1){
                    row++;
                    dir=1;
                }
                else if(row==0){
                    col++;
                    dir=1;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==m-1){
                    col++;
                    dir=0;
                }
                else if(col==0){
                    row++;
                    dir=0;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}