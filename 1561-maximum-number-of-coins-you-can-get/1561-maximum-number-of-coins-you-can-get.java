class Solution {
    public int maxCoins(int[] piles) {
        
        
    Arrays.sort(piles);
    int ans = 0;
    int checking = 0;
    int main = piles.length/3;
    for(int i = piles.length-2; i>=0 ; i=i-2){
        ans = ans+piles[i];  
        checking += 1;
        if(checking == main){
            break;
        }       
    }
    return ans;
        
        
    }
}