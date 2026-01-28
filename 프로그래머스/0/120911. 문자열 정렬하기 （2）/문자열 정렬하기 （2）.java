import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chArr = my_string.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(chArr[i] >= 'A' && chArr[i] <= 'Z'){
                chArr[i] += 32;
            }
        }
        
        Arrays.sort(chArr);
        
        for(char ch : chArr){
            answer += ch;
        }
        return answer;
    }
}