import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String str = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        String[] strArr = str.trim().split("\\s+");
        System.out.print(strArr.length);
        if(strArr[0].equals("")){
            return new String[]{"EMPTY"};
        }
    
        return strArr;
    }
}