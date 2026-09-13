class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int [][]result =new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int newj = (j-rowShift[i]%n+n)%n;
                int newi = (i-colShift[newj]%n+n)%n;
                result[newi][newj]=grid[i][j];
            }
        }
        return result;
    }
}
