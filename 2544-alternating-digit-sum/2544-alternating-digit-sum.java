class Solution {
    public int alternateDigitSum(int n) {
         String s = String.valueOf(n);
        int res = 0;
        for (int i = 0; i < s.length(); i++){
            res += (i % 2 == 0 ? 1 : -1) * (s.charAt(i)-'0');
    }
        return res;
    }
}