import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer stk = new StringTokenizer(my_string, " ");
        String[] answer = new String[stk.countTokens()];
        for(int i =0 ; i < answer.length; i++){
            answer[i] = stk.nextToken();
        }
        return answer;
    }
}