class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        Queue<Integer> pos = new LinkedList<>();
        
        for(int i : nums)
        {
            if(i>=0) pos.add(i);
        }

        Queue<Integer> neg = new LinkedList<>();
        
        for(int i : nums)
        {
            if(i<0) neg.add(i);
        }

        for(int i=0; i<nums.length; i++)
        {
            if(i%2==0)
            {
                nums[i]=pos.poll();
        
            }

            else
            {
                nums[i]=neg.poll();
            }
        }
        return nums; 
    }
}