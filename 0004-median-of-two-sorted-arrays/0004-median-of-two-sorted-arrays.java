class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] temp = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, temp, 0, nums1.length);
        System.arraycopy(nums2, 0, temp, nums1.length, nums2.length);

        Arrays.sort(temp);


        double res = 0;

        if (temp.length % 2 == 0) {
           
            res =(double) (temp[(temp.length / 2)-1] +temp[((temp.length / 2 ))])/2;

        } else {

            res =(double) temp[((temp.length / 2 ))];

        }



        return res;
    }
}