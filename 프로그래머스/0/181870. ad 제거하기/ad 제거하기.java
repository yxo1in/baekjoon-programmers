import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arrList = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                arrList.add(strArr[i]);
            }
        }
        return arrList.toArray(new String[0]);
    }
}