class Solution {
    public int distributeCandies(int[] candyType) {
          Set<Integer> uniqueCandiesSet = new HashSet<>();
        for (int candy: candyType) {
            uniqueCandiesSet.add(candy);
        }
        return Math.min(uniqueCandiesSet.size(), candyType.length / 2);
       // return candyType.length / 2;
    }
}