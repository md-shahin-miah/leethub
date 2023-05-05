class Solution {
   public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int m = (left + right ) / 2;
        
        while( left <= right ){
            m = ( left +right ) / 2;
            if( nums[m] == target ){
                return m;
            }else if( nums[m] < target ){
                left = m + 1;
            }else{
                right = m - 1;
            }
        }
        return left;
    }
}