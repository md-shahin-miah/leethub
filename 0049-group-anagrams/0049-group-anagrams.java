class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, Integer> helper = new HashMap<String, Integer>();
        for (String str : strs) {
            char[] tmpChar = str.toCharArray();
            Arrays.sort(tmpChar);
            String tmp = new String(tmpChar);
            if (helper.containsKey(tmp)) {
                result.get(helper.get(tmp)).add(str);
                continue;
            }

            List<String> temp = new ArrayList<>();
            temp.add(str);
            result.add(temp);
            
            helper.put(tmp, result.size() - 1);
        }
        return result;
    }
}