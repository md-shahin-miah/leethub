class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] counts = new int[26];
        char[] array = s.toCharArray();
        for (char c : array) {
            counts[c-'a']++;
        }
        int cnt = counts[array[0] - 'a'];
        
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0 && counts[i] != cnt) {
                return false;
            }
        }
        return true;
    }
}