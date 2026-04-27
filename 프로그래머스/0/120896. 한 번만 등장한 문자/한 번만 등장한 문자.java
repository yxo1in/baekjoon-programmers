import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0; i < ch.length; i++){
            boolean flag = true;
            for(int j = i+1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    ch[j] = ',';
                    flag = false;
                }
            }
            if(!flag) ch[i] = ',';
            if(ch[i] != ',') answer += ch[i];
        }
        
        return answer;
    }
}