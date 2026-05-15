import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        backtrack(0, nums, new ArrayList<>());

        return ans;
    }

    void backtrack(int index, int[] nums, List<Integer> current) {

        ans.add(new ArrayList<>(current));

        for(int i = index; i < nums.length; i++) {

            // Skip duplicates
            if(i > index && nums[i] == nums[i - 1])
                continue;

            // Choose
            current.add(nums[i]);

            // Recurse
            backtrack(i + 1, nums, current);

            // Undo
            current.remove(current.size() - 1);
        }
    }
}
