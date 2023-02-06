class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] max = new int[m + 1][n + 1];
        for (int i = 0; i < strs.length; i ++) {
            int one = 0;
            int zero = 0;
            for (int j = 0; j < strs[i].length(); j ++) {
                if (strs[i].charAt(j) == '0') {
                    zero ++;
                }
                else {
                    one ++;
                }
            }
            for (int k = m ; k >= zero; k --) {
                for (int l = n; l >= one; l --) {
                    max[k][l] = Math.max(max[k][l], max[k - zero][l - one] + 1);
                }
            }
        }
        return max[m][n];
    }
}