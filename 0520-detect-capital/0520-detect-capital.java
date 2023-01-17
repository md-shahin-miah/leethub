class Solution {
    public boolean detectCapitalUse(String word) {
        
        String regEx = "[A-Z]\\w*";

        boolean firstCharIsCaps = false;
        boolean allCharIs = true;
        boolean lastCharactersIsCaps = false;

        if (word.length() > 1) {

            for (int i = 0; i < word.length(); i++) {


                String valueAt = String.valueOf(word.charAt(i));

                if (!valueAt.matches(regEx)) {
                    allCharIs = false;
                } else {
                    if (i != 0 && valueAt.matches(regEx)) {
                        lastCharactersIsCaps = true;
                    }
                }


                if (i == 0 && valueAt.matches(regEx)) {
                    firstCharIsCaps = true;
                }


            }

      
        } else {
            // if (!word.matches(regEx)){
                return true;
            // }

        }


        if (allCharIs) {
            return true;
        } else if (firstCharIsCaps && !lastCharactersIsCaps) {

            return true;
        }
        else if (!firstCharIsCaps && !lastCharactersIsCaps) {

            return true;
        }
        else {
            return false;
        }
    }
}