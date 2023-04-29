class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int width=0;
        int []a=new int[points.length];
        for(int i=0;i<points.length;i++)
        {
            a[i]=points[i][0];
        }  
        Arrays.sort(a);
        for(int i=a.length-1;i>0;i--)
        {
            width=Math.max(width,(a[i]-a[i-1]));
        }
        return width; 
    }
}