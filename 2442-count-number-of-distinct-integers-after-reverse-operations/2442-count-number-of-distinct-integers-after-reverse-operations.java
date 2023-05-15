class Solution {
 	public static int rev(int n){
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		return rev;
    }
	public int countDistinctIntegers(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int x : nums){
			set.add(x);
			set.add(rev(x));
		}
		return set.size();
	}
}