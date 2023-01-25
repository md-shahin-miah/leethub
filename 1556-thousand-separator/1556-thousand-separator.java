class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        String res = "";
        
        for(int i = 0; i < s.length(); i++){
        
            if(i > 0 && (s.length()-i)%3 == 0){
                res += ".";
            }
            res += String.valueOf(s.charAt(i));
        }
        
        return res; 
    }
}