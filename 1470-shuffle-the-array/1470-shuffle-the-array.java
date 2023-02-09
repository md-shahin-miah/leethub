class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
            r[i] = (i & 1) == 1 ? nums[n + i / 2] : nums[i / 2];
        return r; 
    }
}