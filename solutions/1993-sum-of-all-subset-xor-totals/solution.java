class Solution {

    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int xor) {

        // Reached one subset
        if (index == nums.length) {
            return xor;
        }

        // Include current number
        int include = dfs(nums, index + 1, xor ^ nums[index]);

        // Exclude current number
        int exclude = dfs(nums, index + 1, xor);

        return include + exclude;
    }
}
