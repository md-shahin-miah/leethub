class Solution {
     public boolean checkPerfectNumber(int num) {

         if(num==1){
             return false;
         }
        int tempNum = 1;
        for (int i = 2; i<= Math.sqrt(num); i++) {
// 2*2<num
// 3*3<num
// 4*4<num
// 5*5<num
            if (num % i == 0) {
            //    17 // 1+=2+28/2=14
            //    28 // 17+=4+28/4=7
               
                tempNum += i+num/i;
            }

        
        }
    return tempNum == num;
    }
}