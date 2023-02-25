class Solution {
    public int countAsterisks(String s) {
        int open=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(String.valueOf(s.charAt(i)).equalsIgnoreCase("|") && open==0){ open++;}
            else if(String.valueOf(s.charAt(i)).equalsIgnoreCase("|")&& open>0){ open--;}
            else if(String.valueOf(s.charAt(i)).equalsIgnoreCase("*")&& open==0 ){ count++;}
                

        }
        return count;   
    }
}