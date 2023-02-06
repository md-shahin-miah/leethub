class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        
        int n=a.length;
        int sum=0;
        int dp[]=new int[n];
    
        for(int i=2;i<n;i++)
        {
            if((a[i]-a[i-1])==(a[i-1]-a[i-2])){
                dp[i]=dp[i-1]+1;
            }
            else
            {
                dp[i]=0;
            }
            sum+=dp[i];
        }
        return sum;
    }
}