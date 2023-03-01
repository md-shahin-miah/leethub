class Solution {
    public char repeatedCharacter(String str) {

        HashSet<Character> h = new HashSet<>();
 
        for (int i=0; i<=str.length()-1; i++)
        {
            char c = str.charAt(i);
 
 
            if (h.contains(c)){
                return c;
            
            }
            else {
                h.add(c);
  
            }
            }
 
        return '\0';   
    }
}