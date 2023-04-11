class Solution {
    public int minPartitions(String n) {
         int temp = 0;

        for (int i = 0; i < n.length(); i++) {

             int num=n.charAt(i)-'0';
            
            if (temp<num){
                temp=num;
            }
        }

        
       return temp; 
    }
}