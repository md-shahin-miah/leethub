class Solution {
    public int partitionString(String s) {
         int count=(s.isEmpty())? 0:1;
        
        s=s.toLowerCase();
        HashSet<Character> letter =new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(letter.contains(s.charAt(i))){
                letter.clear();
                count ++;
            }
            letter.add(s.charAt(i));
        }
        return count;
    }
}