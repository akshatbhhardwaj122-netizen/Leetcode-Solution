class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        long current = lower;
        for(int num:nums){
            if(num>upper){
                break;
            }
            if(num<current){
                continue;
            }
            if(num>current){
                result.add(Arrays.asList((int)current,num-1));
            }
            current=(long) num+1;
        }
        if(current<=upper){
            result.add(Arrays.asList((int)current,upper));
        }
        return result;
    }
}
