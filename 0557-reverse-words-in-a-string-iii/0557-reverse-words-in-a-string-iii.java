class Solution {
    public String reverseWords(String s) {
           String[] splited = s.split("\\s+");

        String res="";
        for (int i=0;i<splited.length;i++){

            StringBuilder sb=new StringBuilder(splited[i]);
            res=res+sb.reverse()+" ";
            
        }
        return res.trim();
    }
}