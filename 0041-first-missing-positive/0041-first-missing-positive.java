class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            set.add(nums[i]);

        }

        int num = 1;
        while (num < nums.length+1) {

            if (!set.contains(num)) {
                return num;
            } else {

                num++;

            }

        }


        return num;
        
    }
}