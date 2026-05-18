class Solution {

    int[] memo = new int[31];
    boolean[] found = new boolean[31];

    public int fib(int n) {

        // Base cases
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        // If already calculated
        if (found[n])
            return memo[n];

        // Store Fibonacci value
        memo[n] = fib(n - 1) + fib(n - 2);

        // Mark as found
        found[n] = true;

        return memo[n];
    }
}
