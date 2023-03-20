class Solution {
    public int countKDifference(int[] nums, int k) {
           int res = 0;

     
            for (int i = 0; i < nums.length-1; i++) {

                if (i <= nums.length - 2) {

                    for (int j = i; j < nums.length; j++) {
  
                        int num=(nums[i] - nums[j])<0?(nums[i] - nums[j])*(-1):(nums[i] - nums[j]);
                        if (num == k) {

                            res++;

                        }

                    }

                }

            }
        


        return res;
    }
}