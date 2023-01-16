class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
            int result = 0;
        for (int i = 0; i < words.length; i++) {


            for (int j = 0; j < words[i].length(); j++) {
                boolean contains = true;


            
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {

                    contains = false;
                    break;

                }

          
                if (words[i].length() - 1 == j && contains) {

                    result++;
                }


            }

        }

        return result;
    }
}