class Solution {
    Boolean[] dp;

    public boolean canJump(int[] nums) {
        dp = new Boolean[nums.length];
        return solve(nums, 0);
    }

    private boolean solve(int[] nums, int idx) {
        if (idx >= nums.length - 1) {
            return true;
        }

        if (dp[idx] != null) {
            return dp[idx];
        }

        for (int jump = 1; jump <= nums[idx]; jump++) {
            if (solve(nums, idx + jump)) {
                return dp[idx] = true;
            }
        }

        return dp[idx] = false;
    }
}
