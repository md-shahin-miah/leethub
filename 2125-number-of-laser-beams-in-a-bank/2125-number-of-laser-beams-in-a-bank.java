class Solution {
    public int numberOfBeams(String[] bank) {
           int prevLazer =0;
        int ans =0;
        for(String s: bank){
            int curLazer =0;
            for(char c: s.toCharArray()){
                if(c=='1'){
                    curLazer++;
                }
            }
            if(curLazer>0){
                ans+=(curLazer*prevLazer);
                prevLazer = curLazer;
            }
        }
        return ans;  
    }
}