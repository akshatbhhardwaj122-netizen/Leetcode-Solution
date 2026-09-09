class Solution {

    public int mincostTickets(int[] d, int[] c) {
        int[] dp= new int[d.length];
        Arrays.fill(dp,-1);
        return fun(d, c,0,dp);
    }

    int fun(int[] d, int[] c, int i,int[]dp) {

        int n = d.length;
        if (i >= n) {
            return 0;
        }
        if(dp[i]!= -1) return dp[i];
        int i2 = i;
        for (int j = i; j < n; j++) {
            if (d[j] >= d[i] + 7) {
                i2 = j;
                break;
            }
            i2 = j + 1;
        }

        int i3 = i;
        for (int j = i; j < n; j++) {
            if (d[j] >= d[i] + 30) {
                i3 = j;
                break;
            }
            i3 = j + 1;
        }

        int c1 = c[0] + fun(d, c, i + 1,dp);
        int c2 = c[1] + fun(d, c, i2,dp);
        int c3 = c[2] + fun(d, c, i3,dp);

        return dp[i]=Math.min(c1, Math.min(c2, c3));
    }
}
