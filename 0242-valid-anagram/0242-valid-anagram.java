class Solution {
    public boolean isAnagram(String s, String t) {
       
         StringBuilder temp=new StringBuilder(t);


        boolean isMatched=true;


        if (s.length()==t.length()) {
            for (int i = 0; i < s.length(); i++) {


                for (int j = 0; j < temp.length(); j++) {


                    if (String.valueOf(s.charAt(i)).contains(String.valueOf(temp.charAt(j)))) {
                        temp.deleteCharAt(j);
                        break;
                    }

                }

            }

            if (temp.length()>0){
                isMatched=false;
            }
            else {
                isMatched=true;
            }

        }
        else {
            return  false;
        }
        return isMatched;
    }
}