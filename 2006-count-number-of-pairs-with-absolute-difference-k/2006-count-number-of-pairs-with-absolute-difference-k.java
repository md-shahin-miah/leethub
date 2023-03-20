class Solution {
    public int countKDifference(int[] nums, int k) {
           int res = 0;

     
            for (int i = 0; i < nums.length; i++) {

                if (i <= nums.length - 2) {

                    for (int j = i; j < nums.length; j++) {

                        if ((Math.abs(nums[i] - nums[j])) == k) {

                            res++;
                            

                        }

                    }

                }

            }
        


        return res;
    }
}