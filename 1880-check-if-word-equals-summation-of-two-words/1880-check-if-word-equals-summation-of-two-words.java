class Solution {
     public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        HashMap<String,Integer> hashMap=new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i=0;i<alphabet.length;i++){
            hashMap.put(String.valueOf(alphabet[i]),i);
        }
        String tempFirst="";
        String tempSecond="";
        String tempTarget="";


        for (int j=0;j<firstWord.length();j++){
            
            tempFirst+=hashMap.get(String.valueOf(firstWord.charAt(j)).toLowerCase());

        }

        for (int k=0;k<secondWord.length();k++){

            tempSecond+=hashMap.get(String.valueOf(secondWord.charAt(k)).toLowerCase());

        }

        for (int l=0;l<targetWord.length();l++){

            tempTarget+=hashMap.get(String.valueOf(targetWord.charAt(l)).toLowerCase());

        }

        int tempFirstInt=Integer.parseInt(tempFirst);
        int tempSecondInt=Integer.parseInt(tempSecond);
        int tempTargetInt=Integer.parseInt(tempTarget);


        if ((tempFirstInt+tempSecondInt)==tempTargetInt){
            return true;
        }
        else {
            return false;
        }

    }
}