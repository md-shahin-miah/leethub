class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
        int maxPairSum=0;
        for(int i=0;i<=nums.length/2;i++){
            maxPairSum=Math.max(maxPairSum, nums[i] + nums[nums.length-1-i] );
        }
        return maxPairSum;   
    }
}