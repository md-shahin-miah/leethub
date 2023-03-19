class Solution {
    public int prefixCount(String[] words, String pref) {
          int res = 0;
        int prefixLen = pref.length();
        
        for (String w : words) {
        
            if (prefixLen > w.length()) {
                continue;
            }
            
            if (pref.equals(w.substring(0, prefixLen))) {
                res++;
            }
        }
        
        return res;  
    }
}