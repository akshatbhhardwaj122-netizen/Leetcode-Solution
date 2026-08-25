class Solution {
    public int missingMultiple(int[] nums, int k) {

        int i = 1;

        while (true) {
            int product = i * k;
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == product) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return product;
            }

            i++;
        }
    }
}
