class Solution {
        public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int res=result.size();
            if (res == 0) {
//                List<Integer> ll = new ArrayList<>(nums[i]);
                List<Integer> s =new ArrayList<>();
                s.add(nums[i]);
                result.add(new ArrayList<>(s));

            } else {
                for (int j = 0; j < res; j++) {


                    List<Integer> ll = result.get(j);

                 

                    if (!ll.contains(nums[i])) {
                        ll.add(nums[i]);
                        break;
                    } else {

                        if(j==res-1){
                            List<Integer> s =new ArrayList<>();
                            s.add(nums[i]);
                            result.add(new ArrayList<>(s));
                        }

                    }



                }
            }

        }

        return result;
    }

}