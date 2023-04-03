class Solution {
   private int isVowel(char c)
    {
        return "aoeiu".indexOf(c) != -1 ? 1 : 0;
    }
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        len /= 2;
        int cnt1 = 0;
        int cnt2 = 0;
        s = s.toLowerCase();
        for(int i=0; i<len; i++)
        {
            cnt1 += isVowel(s.charAt(i));
            cnt2 += isVowel(s.charAt(i+len));
        }
        return cnt1 == cnt2;
}}