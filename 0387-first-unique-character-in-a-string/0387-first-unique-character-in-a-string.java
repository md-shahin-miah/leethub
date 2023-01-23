class Solution {
    public int firstUniqChar(String s) {
         int[] hash = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(hash[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
}