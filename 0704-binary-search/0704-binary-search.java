class Solution {
    public int search(int[] list, int target) {
       
        
           int length = list.length;

        int left = 0, right = length - 1, mid = 0;


        while (left <= right) {
            mid = (left + right) / 2;
            if (list[mid] == target) {
                return mid;
            }
            if (list[mid] <= target) {
                left = mid + 1;

            } else {
                right = mid - 1;

            }

        }


        return -1;
        
    }
}