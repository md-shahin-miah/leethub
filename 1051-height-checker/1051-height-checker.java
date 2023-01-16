class Solution {
    public int heightChecker(int[] heights) {
        List<Integer> lList = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < heights.length; i++) {
            lList.add(heights[i]);
        }
        Collections.sort(lList);

        for (int j = 0; j < lList.size(); j++) {

            if (!lList.get(j).equals(heights[j])) {
                counter++;
            }
        }

        return counter;
    }
}