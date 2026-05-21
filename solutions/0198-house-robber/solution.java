class Solution {
    static int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;

        dp = new int[n];
        Arrays.fill(dp, -1);

        return loot(0, nums);
    }

    public int loot(int i, int[] nums) {

        // Base case
        if (i >= nums.length)
            return 0;

        // Already calculated
        if (dp[i] != -1)
            return dp[i];

        // Rob current house
        int loot = nums[i] + loot(i + 2, nums);

        // Skip current house
        int skip = loot(i + 1, nums);

        // Store maximum answer
        return dp[i] = Math.max(skip, loot);
    }
}
