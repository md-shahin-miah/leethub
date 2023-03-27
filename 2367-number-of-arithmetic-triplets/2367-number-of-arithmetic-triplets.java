class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
       Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        
        int ans = 0;
        
        for (int x : nums) {
            if (set.contains(x - diff) && set.contains(x + diff)) {
                ans++;
            }
        }
        return ans;   
    }
}