class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    
        int[] solution = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(i != j && nums[j] < nums[i])
                {
                    solution[i] += 1;
                }
            }
        }
        return solution;
    
    }
}