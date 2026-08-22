class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    void fun(int[] nums, List<Integer> temp, int start) {

        ans.add(new ArrayList<>(temp));

        if (start == nums.length)
            return;

        for (int i = start; i < nums.length; i++) {

            List<Integer> op = new ArrayList<>(temp);

            op.add(nums[i]);

            fun(nums, op, i + 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        fun(nums, new ArrayList<>(), 0);

        return ans;
    }
}
