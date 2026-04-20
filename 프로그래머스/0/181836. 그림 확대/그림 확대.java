import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] picture, int k) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < picture.length; i++){
            String temp = "";
            for(int j = 0; j < picture[i].length(); j++){
                for(int l = 0; l < k; l++){
                    temp += picture[i].charAt(j);
                }
            }
            for(int l = 0; l < k; l++){
                answer.add(temp);
            }
        }
        return answer;
    }
}