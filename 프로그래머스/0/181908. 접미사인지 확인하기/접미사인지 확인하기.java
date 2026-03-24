import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;        
        String temp = "";
        ArrayList<String> str = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            temp = my_string.substring(i, my_string.length());
            str.add(temp);
        }
        String[] arr = str.toArray(new String[0]);
        for(int i = 0; i < arr.length; i++){
            if(is_suffix.equals(arr[i])){
                return 1;
            }
        }
        return answer;
    }
}