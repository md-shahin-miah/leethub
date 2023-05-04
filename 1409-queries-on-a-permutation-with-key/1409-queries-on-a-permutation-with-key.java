class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> P = new LinkedList<>();
        for (int i=1; i<=m;i++)
            P.add(i);
        
        int[] res = new int[queries.length];
        
        for (int i=0; i<queries.length; i++) {
            int q = queries[i];
            int idx = P.indexOf(q);
            int val = P.get(idx);
            P.remove(idx);
            P.addFirst(val);
            res[i] = idx;
        }
        
        return res;   
    }
}