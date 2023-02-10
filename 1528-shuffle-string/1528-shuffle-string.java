class Solution {
    public String restoreString(String s, int[] indices) {
        int count = 0; 
        char[] array = new char[indices.length];
        for(int i = 0 ; i < indices.length ; i++){
            array[indices[i]] = s.charAt(i);
        }
        return new String(array);
    }
}