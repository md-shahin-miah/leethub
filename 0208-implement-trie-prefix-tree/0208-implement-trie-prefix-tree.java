class Trie {

 
HashSet<String> set;
    
    public Trie() {
    set=new HashSet<>();
    }
    
    public void insert(String word) {
       set.add(word);
    }
    
    public boolean search(String  word) {
        if(!set.contains(word))
return false;
        return true;
    }
    
    public boolean startsWith(String prefix) {
        
        for(String s:set){
           if(s.indexOf(prefix)==0)
         return true;
            
        }
        return false;
    }
}


 
    
 
