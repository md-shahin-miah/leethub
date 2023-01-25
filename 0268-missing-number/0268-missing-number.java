class Solution {
    public int missingNumber(int[] nums) {
          int[] temps = new int[nums.length + 1];
    for (int i : nums) {
        temps[i] = 1;
    }

    int res = -1;
    for (int i = 0; i < temps.length; i++) {
        if (temps[i] != 1) {
            res = i;
            break;
        }
    }
    return res;
    }
}