class Solution {
    public int lengthOfLongestSubstring(String str) {
           
        int n = str.length();
        int res = 0;
        ArrayList < Character > visited = new ArrayList();
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                
                if (visited.contains((str.charAt(j)))) {
                    visited.clear();
                    break;
                } else {
                    visited.add((str.charAt(j)));
                    if (res < j - i + 1) {
                        res = j - i + 1;
                    }

                }
                
            }

        }
        
        return res;   
    }
}