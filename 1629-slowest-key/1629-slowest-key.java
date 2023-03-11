class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] chArr = keysPressed.toCharArray();
        int len = chArr.length;
        char res = chArr[0];
        int maxNum = releaseTimes[0];

        for (int i = 1; i < len; i++) {
            int tmp = releaseTimes[i] - releaseTimes[i - 1];
            if (tmp > maxNum) {
                maxNum = tmp;
                res = chArr[i];
            } else if (tmp == maxNum && chArr[i] > res) {
                maxNum = tmp;
                res = chArr[i];
            }
        }

        return res;  
    }
}