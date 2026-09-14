class Solution {
    public int thirdMax(int[] nums) {
        // Use Long to avoid integer underflow issues during comparison
        Long firstMax = null;
        Long secondMax = null;
        Long thirdMax = null;

        for (int num : nums) {
            long current = num;
            
            // Skip duplicate values
            if ((firstMax != null && current == firstMax) || 
                (secondMax != null && current == secondMax) || 
                (thirdMax != null && current == thirdMax)) {
                continue;
            }

            // Shift maximums down as needed
            if (firstMax == null || current > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = current;
            } else if (secondMax == null || current > secondMax) {
                thirdMax = secondMax;
                secondMax = current;
            } else if (thirdMax == null || current > thirdMax) {
                thirdMax = current;
            }
        }

        // Return third maximum if it exists, otherwise the first maximum
        return thirdMax == null ? firstMax.intValue() : thirdMax.intValue();
    }
}

