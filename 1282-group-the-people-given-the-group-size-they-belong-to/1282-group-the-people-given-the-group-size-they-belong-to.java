class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();


        for (int i = 0; i < groupSizes.length; i++) {

            int currValueAsKey = groupSizes[i];

            if (!map.containsKey(currValueAsKey)) {
                map.put(currValueAsKey, new ArrayList<>());

            }

            ArrayList<Integer> values = map.get(currValueAsKey);
            values.add(i);

            if (values.size() == currValueAsKey) {
                result.add(new ArrayList<>(values));
                values.clear();

            }


        }


        return result;  
    }
}