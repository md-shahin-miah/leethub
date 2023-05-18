class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> hs=new HashSet<>();
        int []out=new int[A.length];
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
            hs.add(B[i]);
            out[i]=2*(i+1)-hs.size();
        }

        return out;   
    }
}