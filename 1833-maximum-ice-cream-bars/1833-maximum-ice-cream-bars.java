class Solution {
    public int maxIceCream(int[] costs, int coins) {
   
        Arrays.sort(costs);
        int answer = 0, i = 0;
        
        while(i < costs.length && coins >= costs[i]){
            coins -= costs[i];
            answer++;
            i++;
        }

        return answer;      
    }
}