class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> app = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i ++) {
            app.add(nums1[i]);
        }
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i ++) {
            if (app.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (Integer j:res) {
            result[i++] = j;
        }
        return result;  
    }
}