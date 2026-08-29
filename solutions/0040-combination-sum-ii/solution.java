class Solution {

    void fun(List<Integer> input, List<Integer> output,
             List<List<Integer>> ans, int target, int sum) {

        if (sum == target) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if (sum > target || input.size() == 0)
            return;

        for (int i = 0; i < input.size(); i++) {

            List<Integer> ip = new ArrayList<>(input);
            List<Integer> op = new ArrayList<>(output);

            if (i > 0 && ip.get(i).equals(ip.get(i - 1)))
                continue;

            op.add(ip.get(i));

            ip.subList(0, i + 1).clear();

            fun(ip, op, ans, target, sum + op.get(op.size() - 1));
        }
    }

    public List<List<Integer>> combinationSum2(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for (int a : nums) {
            input.add(a);
        }

        Collections.sort(input);

        fun(input, output, ans, target, 0);

        return ans;
    }
}
