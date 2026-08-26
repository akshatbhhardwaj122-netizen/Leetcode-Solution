class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    void fun(int n, int k, List<Integer> temp, int start) {

        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {

            List<Integer> op = new ArrayList<>(temp);

            op.add(i);

            fun(n, k, op, i + 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {

        fun(n, k, new ArrayList<>(), 1);

        return ans;
    }
}
