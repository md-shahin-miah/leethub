class Solution {
    public String replaceDigits(String s) {
          String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                int number = Integer.parseInt(String.valueOf(s.charAt(i)));
                int index = alpha.indexOf(s.charAt(i - 1));
                char c = alpha.charAt(index + number);
                sb.setCharAt(i,c);

            } 
        }

        return sb.toString();
    }
}