class Solution {
  public int smallestEvenMultiple(int n) {
   int number = 0;
        if (n % 2 == 0 && n % n == 0) {
            return n;
        }
        int i = n;
        while (number!=i){
            if (i % 2 == 0 && i % n == 0) {
                number = i;
                break;
            }

            i++;
        }
        return number;

    }
}