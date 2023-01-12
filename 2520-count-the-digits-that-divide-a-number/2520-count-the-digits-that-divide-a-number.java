class Solution {
   public int countDigits(int num) {
        int result = 0;
        String number = String.valueOf(num);
        if (!number.contains("0")) {
            for (int j = 0; j < number.length(); j++) {
                int k = Character.digit(number.charAt(j), 10);

                if (num % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}