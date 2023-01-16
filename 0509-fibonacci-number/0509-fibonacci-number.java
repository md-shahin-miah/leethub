class Solution {
    public int fib(int n) {
    if (n==1){
            return 1;
        }
        else if (n==2){
            return 1;
        }

        List<Integer> list = new ArrayList<>();
        int result=0;
        int prev1 = 0;
        int prev2 = 1;
        int current = 0;
        list.add(0);
        list.add(1);
        for (int i = 2; i < n; i++) {
            current = prev1 + prev2;
            list.add(current);
            prev1 = prev2;
            prev2=current;

        }

//        Log.d(TAG, "fib:  " + list);
        
        if (n>2){
                 result  = list.get(n - 1) + list.get(n - 2);

        }
        
        return result;
    }
}