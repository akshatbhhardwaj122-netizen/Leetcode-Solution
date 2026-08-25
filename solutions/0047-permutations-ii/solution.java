import java.util.*;

class Solution {

    void fun(List<Integer> nums, List<Integer> tmp, List<List<Integer>> ans) {

        if (nums.size() == 0) {
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {

            // Skip duplicate choices at this level
            if (i > 0 && nums.get(i).equals(nums.get(i - 1))) {
                continue;
            }

            List<Integer> ip = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(tmp);

            op.add(nums.get(i));
            ip.remove(i);

            fun(ip, op, ans);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<Integer> input = new ArrayList<>();
        for (int num : nums) {
            input.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();

        fun(input, new ArrayList<>(), ans);

        return ans;
    }
}
