class Solution {
    public int minPartitions(String n) {
         int temp = 0;

        for (int i = 0; i < n.length(); i++) {

            if (temp<n.charAt(i)-'0'){
                temp=n.charAt(i)-'0';
            }
        }

        
       return temp; 
    }
}