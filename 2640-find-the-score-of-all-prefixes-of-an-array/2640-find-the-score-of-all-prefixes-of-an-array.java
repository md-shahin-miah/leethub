class Solution {
    public long[] findPrefixScore(int[] nums) {
    
        int  max = -1;
        long[] conv = new long[nums.length];
        
        for(int i=0;i<nums.length;i++){
          max = Math.max(max, nums[i]);
          conv[i] = nums[i] + max;
        }
        
        for(int i=1;i<nums.length;i++){
            conv[i] = conv[i-1] + conv[i];
        }
        
        return conv;
    }
}