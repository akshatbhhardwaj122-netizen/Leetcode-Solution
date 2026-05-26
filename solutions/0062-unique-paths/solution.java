class Solution {

    int[][] dp;

    public int uniquePaths(int m, int n) {

        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(0, 0, m, n);
    }

    public int solve(int i, int j, int m, int n) {

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (i == m || j == n) {
            return 0;
        }

        // already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // store result
        dp[i][j] = solve(i + 1, j, m, n)
                 + solve(i, j + 1, m, n);

        return dp[i][j];
    }
}
