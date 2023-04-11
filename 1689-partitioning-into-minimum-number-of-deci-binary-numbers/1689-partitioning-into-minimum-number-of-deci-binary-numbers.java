class Solution {
    public int minPartitions(String n) {
        int temp =n.charAt(0)-'0';

        for (int i = 1; i < n.length(); i++) {

            int num=n.charAt(i)-'0';

            if (temp<num){
                temp=num;
            }
        }


       return temp;
    }
}