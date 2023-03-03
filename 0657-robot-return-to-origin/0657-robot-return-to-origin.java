class Solution {
    public boolean judgeCircle(String moves) {
         int x=0;
        int y=0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'U'){
                y++;
            }
            else if(moves.charAt(i)=='D'){
                y--;
            }
           else if(moves.charAt(i)=='R'){
                x++;
            }
            else{
                x--;
            }
        }

        if(x==0 && y==0){
            return true;
        }
        else{
            return false;
        }  
    }
}