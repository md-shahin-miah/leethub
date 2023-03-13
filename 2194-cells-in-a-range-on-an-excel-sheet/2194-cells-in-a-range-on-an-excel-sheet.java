class Solution {
    public List<String> cellsInRange(String s) {
        
       char start = s.toLowerCase().charAt(0);
        int startNumber = s.charAt(1) - '0';
        char end = s.toLowerCase().charAt(3);
        int endNumber = s.charAt(4) - '0';

        List<String> res = new ArrayList<>();
        

        for (char c = start; c <= end; c++) {
            if (endNumber > 1) {
                for (int i = startNumber; i <= endNumber; i++) {
                    res.add(String.valueOf(c).toUpperCase()+(i));
                }
            }
            else {
                res.add(String.valueOf(c).toUpperCase()+1);
            }

        }

    
        return res;
    }
}