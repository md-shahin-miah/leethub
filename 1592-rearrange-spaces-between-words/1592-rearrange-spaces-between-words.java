class Solution {
    public String reorderSpaces(String text) {
                
        String[] words = text.trim().split("\\s+");
        int spaces = 0;
        for(int i = 0; i < text.length(); i++)
            if (text.charAt(i)==' ')
                spaces++;
        int evenly = (words.length > 1)?spaces / (words.length -1): spaces;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <words.length;i++){
            result.append(words[i]);
            evenly = Math.min(evenly, spaces);
            result.append(" ".repeat(evenly));
            spaces -=evenly;
        }
        if (spaces > 0)
            result.append(" ".repeat(spaces));
        return result.toString(); 

    }
}