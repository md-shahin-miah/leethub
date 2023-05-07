class Solution {
    public int maxSatisfaction(int[] satisfaction) {
    Arrays.sort(satisfaction);
    int sum = 0, tot = 0, maxi = 0;
    
    for(int i = satisfaction.length - 1; i >= 0 && sum >= 0; --i){
      tot += sum + satisfaction[i];
      sum += satisfaction[i];
      if( tot > maxi) maxi = tot;
    }
    
    return maxi;   
    }
}