class Solution {
    public int findMaxK(int[] arr) {
           int res = 0;
 
        Arrays.sort(arr);

        int l = 0, r = arr.length - 1;
 
        while (l < r) {
 
            int sum = arr[l] + arr[r];
 
            if (sum == 0) {
                res = Math.max(
                    res, Math.max(
                             arr[l], arr[r]));
 
                return res;
            }
 
            else if (sum < 0) {
                l++;
            }
 
            // Otherwise, decrement r
            else {
                r--;
            }
        }
 
        return res == 0 ? -1 : res;
    }
}