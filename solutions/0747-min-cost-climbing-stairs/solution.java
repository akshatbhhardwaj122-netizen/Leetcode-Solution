class Solution {
    int []dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(fun(0,cost,dp),fun(1,cost,dp));
    }
    int fun (int i,int[]cost,int []dp){
        if(i>=cost.length) return 0;
        if(dp[i]!= -1) return dp[i];
        int one=fun(i+1,cost,dp);
        int two=fun(i+2,cost,dp);
       return dp[i]=cost[i] + Math.min(one, two);
    }
}
