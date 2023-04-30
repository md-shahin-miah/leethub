class Solution {
 
    public int triangularSum(int[] nums) {
      int length = nums.length;
      return helper(nums, length); 
    }
    
    
        public int helper(int[] arr, int n) {
        if(n == 1) return arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] =(arr[i]+arr[i+1])%10; 
        }
        return helper(arr,n-1);
    }
}