class Solution {
    public String reverseWords(String s) {
        StringBuilder ss=new StringBuilder();
        
      
        String[] splited =s.trim().split("\\s+");

          if(splited.length<2){
            return s.trim();
        }
        
        
    
        for(int i=splited.length-1;0<=i;i--){
            
            if(splited.length-1==i){
                ss.append(splited[i].trim()+" ");
            }
            else if(i==0){
                 ss.append(splited[i].trim());
            }
            else{
                 ss.append(splited[i].trim()+" ");
            }
            
        }
            
       return ss.toString();

    }
}