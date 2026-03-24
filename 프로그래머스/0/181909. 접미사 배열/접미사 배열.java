import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        String temp = "";
        for(int i = 0; i < my_string.length(); i++){
            temp = my_string.substring(i, my_string.length());
            arr.add(temp);
        }
        String[] answer = arr.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}