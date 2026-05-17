class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] nums, List<Integer> current,
                          List<List<Integer>> result) {

        // Agar permutation complete ho gayi
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Har number ko try karo
        for (int i = 0; i < nums.length; i++) {

            // Agar number already use ho chuka hai
            if (current.contains(nums[i])) {
                continue;
            }

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(nums, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
