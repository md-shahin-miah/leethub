class Solution {
    public int tribonacci(int n) {
         if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else if (n==2){
            return 1;
        }
        else if (n==3){
            return 2;
        }

        List<Integer> list = new ArrayList<>();
        int result=2;
        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 1;
        int current = 0;
        list.add(prev1);
        list.add(prev2);
        list.add(prev3);
        for (int i = 3; i < n; i++) {


            current = prev1 + prev2+prev3;
            list.add(current);
            prev1 = prev2;
            prev2 = prev3;
            prev3=current;




        }

        if (n>3){
            result  = list.get(n - 1) + list.get(n - 2)+list.get(n - 3);

        }


        return result;
    }
}