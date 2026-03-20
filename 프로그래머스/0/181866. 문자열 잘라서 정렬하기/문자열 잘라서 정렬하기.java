import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> arrList = new ArrayList<>();
        String[] str = myString.split("x");
        for(int i = 0; i < str.length; i++){
            if(!str[i].equals(""))
                arrList.add(str[i]);
        }
        Collections.sort(arrList);
        return arrList.toArray(new String[0]);
    }
}