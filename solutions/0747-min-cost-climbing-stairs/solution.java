class Solution {

    public int minCostClimbingStairs(int[] cost) {

        Integer[] dp = new Integer[cost.length];

        return Math.min(
                solve(cost, 0, dp),
                solve(cost, 1, dp)
        );
    }

    public int solve(int[] cost, int index, Integer[] dp) {

        if (index >= cost.length) {
            return 0;
        }

        if (dp[index] != null) {
            return dp[index];
        }

        int oneStep = solve(cost, index + 1, dp);
        int twoStep = solve(cost, index + 2, dp);

        return dp[index] = cost[index] + Math.min(oneStep, twoStep);
    }
}
