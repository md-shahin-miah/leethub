class Solution {
    public int minOperations(int n) {
    int[] arr= new int[n];
        
    int c=0,mid=(n-1)/2;
        
    for(int i=0;i<n;i++){
        
    arr[i]=(2*i)+1;
        
    if(arr[i]!=n && i<=mid){
        
        c=c+(n-arr[i]);
        
        }
    
    }
    
        return c;

    }
}