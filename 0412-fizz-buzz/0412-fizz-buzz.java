class Solution {
      public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                if (i % 3 == 0 && i % 5 == 0) {

                    list.add(i-1,"FizzBuzz");

                } else if (i % 3 == 0) {
                    list.add(i-1,"Fizz");
                } else if (i % 5 == 0) {
                    list.add(i-1,"Buzz");
                } else {
                    list.add(i-1,String.valueOf(i));
                }
            }
            else {
                list.add(i-1,String.valueOf(i));
            }

        }


        return list;
    }
}