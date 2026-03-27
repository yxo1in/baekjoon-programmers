import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> arr = new ArrayList<>();
        int i = 0;
        for(i = 0; i < my_str.length() - n; i += n){
            arr.add(my_str.substring(i, i+n));   
        }
        arr.add(my_str.substring(i, my_str.length()));
        return arr.toArray(new String[0]);
    }
}