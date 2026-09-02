class Solution {
    int []dp;
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n];
       for (int j = 0; j < n; j++) dp[j] = -1;
    return fun(nums,0,0);
    }
    int fun(int nums[],int i,int ans){
        if(i>=nums.length){
            return 0;
        } 
         if (dp[i] != -1) return dp[i];
        int skip1= nums[i]+fun(nums,i+2,ans);
        int skip2=fun(nums,i+1,ans);
        ans = Math.max(skip1,skip2);
        dp[i]= ans;
        return ans;
    }
}
