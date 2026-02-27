class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    int [] ans = new int [n];
    int index=0;
    k = k % n;
    for(int i=n-k;i<n;i++){
        ans[index++] = nums[i];
    }
    for(int i=0;i<n-k;i++){
        ans[index++]=nums[i];
    }
    for(int i = 0; i < n; i++){
    nums[i] = ans[i];
}
   
    }
}
