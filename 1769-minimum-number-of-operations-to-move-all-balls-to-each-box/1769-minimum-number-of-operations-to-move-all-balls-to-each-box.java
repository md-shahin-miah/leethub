class Solution {
      public int[] minOperations(String boxes) {
        int [] m = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++){
            for(int j = 0; j < boxes.length(); j++){
                if(boxes.charAt(j) == '1' && i !=  j)
                    m[i] += Math.abs(i-j);
            }
        }   
        return m;
    }
}