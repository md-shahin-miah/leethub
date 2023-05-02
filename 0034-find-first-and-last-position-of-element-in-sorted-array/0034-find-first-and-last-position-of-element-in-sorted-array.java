class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] res = new int[2];

        Arrays.sort(nums);

        boolean isAddedFirst = false;
        boolean isTargetFound = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                if (!isAddedFirst) {
                    res[0] = i;
                       res[1] = i;
                    isAddedFirst = true;
                    isTargetFound=true;
                } else {
                    
                    res[1] = i;
                }
            }


        }

        if (!isTargetFound){
          return  new int[]{-1,-1};
        }
        

        return  res; 
    }
}