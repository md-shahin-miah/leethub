class Solution {
    public int minAddToMakeValid(String s) {
        
       Stack<Character> stack = new Stack<>();
        int count = 0;
        
        for (char ch : s.toCharArray()) {

            if (stack.isEmpty()) {

                if (ch == '(') {

                    stack.push(ch);

                } else {

                    count++;
                }

            } else {

                if (ch == '(') {
                    stack.push(ch);
                } else {
                    stack.pop();
                }

            }


        }
        if (!stack.isEmpty()) {
            count += stack.size();
        }
        
        
        
        
        return count;
    }
}