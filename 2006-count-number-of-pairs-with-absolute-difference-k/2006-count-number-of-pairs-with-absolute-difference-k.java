class Solution {
    public int countKDifference(int[] nums, int k) {
           int res = 0;

     
            for (int i = 0; i < nums.length-1; i++) {

                if (i <= nums.length - 2) {

                    for (int j = i+1; j < nums.length; j++) {
  
                      int lift=nums[i] - nums[j];
                        int num=lift<0?lift*(-1):lift;
                        if (num == k) {

                            res++;

                        }

                    }

                }

            }
        


        return res;
    }
}