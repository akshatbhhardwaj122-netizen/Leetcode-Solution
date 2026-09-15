class Solution {
    int [][]dp;
    public int change(int amount, int[] coins) {
        dp=new int [coins.length][amount+1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return countWays(coins, 0, amount,dp);
    }

    public int countWays(int[] coins, int i, int amount,int [][]dp) {

        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        if (i == coins.length) {
            return 0;
        }
        if (dp[i][amount] != -1) return dp[i][amount];
        int take = countWays(coins, i, amount - coins[i],dp);

        int skip = countWays(coins, i + 1, amount,dp);

        return dp[i][amount] = take + skip;
    }
}
