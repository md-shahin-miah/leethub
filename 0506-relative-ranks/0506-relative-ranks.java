class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if (nums == null) {
            return null;
        }
        String[] result = new String[nums.length];
        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++) {
            index.put(nums[i], i);
        }
        Arrays.sort(nums);
        
        String[] prizes = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = nums.length - 1; i >= 0; i --) {
            int rank = nums.length - 1 - i;
            if (rank < 3) {
                result[index.get(nums[i])] = prizes[rank];
            }
            else {
                result[index.get(nums[i])] = "" + (rank + 1);
            }
        }
        return result;
    }
}