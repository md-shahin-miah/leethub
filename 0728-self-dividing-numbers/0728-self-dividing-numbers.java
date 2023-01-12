class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {


        List<Integer> integers = new ArrayList<>();


        for (int i = left; i <= right; i++) {

            if (i < 10) {
                integers.add(i);
            } else {
                boolean isDivisible = true;
                String number = String.valueOf(i);
                if (!number.contains("0")) {
                    for (int j = 0; j < number.length(); j++) {
                        int k = Character.digit(number.charAt(j), 10);

                        if (i % k != 0) {
                            isDivisible = false;
                        }
                    }
                    if (isDivisible) {
                        integers.add(i);
                    }
                }
            }


        }

        return integers;
    }
}