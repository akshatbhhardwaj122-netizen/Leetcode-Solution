class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int count=0;
        for(int x:set){
            if(fun(nums,x)==1){
                count++;
            }
        }
        return count;
    }
    int fun(int[]nums,int x){
        int first=-1;
         int second=-1;
        int third=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
               count++;
                if(count==1){
                    first=i;
                }
                 else if(count==2){
                     second=i;
                 } 
                else if(count==3) {
                    third=i;
                }
               }
        }
            if(count!=3) return 0;
            if(second-first==third-second) return 1;
            return 0;
    }
}
