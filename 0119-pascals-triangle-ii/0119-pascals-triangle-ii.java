class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0;i < rowIndex + 1; i ++) {
            result.add(1);
            for (int j = i; j >=0; j --) {
                if (j != 0 && j != i) {
                    result.set(j, result.get(j) + result.get(j-1));
                }
            } 
        }
        return result;
    }
}