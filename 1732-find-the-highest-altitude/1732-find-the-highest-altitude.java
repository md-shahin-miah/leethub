class Solution {
    public int largestAltitude(int[] gain) {
       int highest = 0;
		int currentAltitude = 0;

		for (int i = 0; i < gain.length; ++i)
		{
			currentAltitude += gain[i];

			if (currentAltitude > highest)
			{
				highest = currentAltitude;
			}
		}

		return highest; 
    }
}