class Solution {
  public String capitalizeTitle(String title) {

        String[] splited = title.toLowerCase().split("\\s+");

        String res="";

        for (int i=0;i<splited.length;i++){

            StringBuilder s=new StringBuilder();



            if (splited[i].length()>2) {
                for (int j = 0; j < splited[i].length(); j++) {
                    if (j == 0) {
                        s.append(String.valueOf(splited[i].charAt(j)).toUpperCase());

                    } else {
                        s.append(splited[i].charAt(j));
                    }

                }

                res=res+""+s.toString()+" ";
            }

            else {
                res=res+""+splited[i]+" ";
            }




        }


        return res.trim();
    }
}