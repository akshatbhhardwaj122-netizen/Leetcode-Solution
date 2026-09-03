class Solution {

    int[] dp;

    public int climbStairs(int n) {

        dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return fun(n, 0);
    }

    int fun(int n, int i) {

        if(i == n)
            return 1;

        if(i > n)
            return 0;

        if(dp[i] != -1)
            return dp[i];

        dp[i] = fun(n, i + 1) + fun(n, i + 2);

        return dp[i];
    }
}
