class Solution {
     public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans= new ArrayList<>();
        String pattern_label=getLabel(pattern);
        System.out.println(pattern_label);
        for(String s: words)
        {
            System.out.println(getLabel(s));
            if(pattern_label.equals(getLabel(s)))
            {
                ans.add(s);
            }
        }
        return ans;
    }

    public String getLabel(String str)
    {
        int counter=0;
        String label="";
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                counter++;
                map.put(str.charAt(i),counter);
                label=label+Integer.toString(counter)+" ";
              
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i)));
                label=label+Integer.toString(map.get(str.charAt(i)))+" ";
            }
        }
        return label;
    }
}