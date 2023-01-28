class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int pos = 0;
        int line = 1;
        
        for(int i = 0; i < S.length(); i++){

            pos += widths[S.charAt(i) - 'a'];
            if(pos > 100){
                line++;
                pos = 0;
                i--;
            }
        }
        int [] num = new int[2];
        num[0] = line;
        num[1] = pos;
        return num;
    }
}