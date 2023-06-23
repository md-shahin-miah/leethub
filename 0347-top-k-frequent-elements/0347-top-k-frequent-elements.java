class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
         int [] output = new int[k];
         int n = nums.length; 
         HashMap <Integer , Integer> emp = new HashMap<>();                     
         boolean visited[] = new boolean[n];
         Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;
 
                    int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        visited[j] = true;
                        count++;
                    }
                }   
                   emp.put(nums[i], count);
        }
        
        
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(emp.entrySet());
         Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));
         
         List<Integer> topKKeys = list.stream().map(Map.Entry::getKey).limit(k).collect(Collectors.toList());
         
         for (int i = 0; i < k; i++) {
             output[i] = topKKeys.get(i);
         }
        
        
         return output;
    }
}