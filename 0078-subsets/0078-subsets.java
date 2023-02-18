class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> answer = new ArrayList<>();
    backtrace(nums, 0, new ArrayList<Integer>(), answer);
    return answer;   
    }
    
    public void backtrace(int[] nums, int start, List<Integer> track, List<List<Integer>> answer) {
    answer.add(new ArrayList<>(track));
    for (int i = start; i < nums.length; i++) {
      track.add(nums[i]);
      backtrace(nums, i + 1, track, answer);
      track.remove(track.size() - 1);
    }
  }
}