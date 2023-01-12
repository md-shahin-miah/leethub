class Solution {
    public int addDigits(int num) {
         int result = 0;
        String number =""+num;
        if (num > 0) {
            for (int j = 0; j < number.length(); j++) {
                int k = Character.digit(number.charAt(j), 10);

                result += k;
            }
        }

        if (String.valueOf(result).length() < 2) {
            return result;
        } else {
            return addDigits(result);
        }
    }
}