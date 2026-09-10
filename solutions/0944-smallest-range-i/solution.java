class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = nums[0];
        int maxVal = nums[0];
        
        // Find the min and max elements in the array
        for (int num : nums) {
            if (num < minVal) {
                minVal = num;
            }
            if (num > maxVal) {
                maxVal = num;
            }
        }
        
        // Calculate the minimized score
        int score = maxVal - minVal - 2 * k;
        
        // If the score is negative, it means we can make all elements equal (score = 0)
        return Math.max(0, score);
    }
}

