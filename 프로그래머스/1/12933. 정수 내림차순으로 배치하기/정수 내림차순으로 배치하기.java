import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        
        for(int i = ch.length - 1; i >= 0; i--){
            answer *= 10;
            answer += (int)(ch[i] - '0');
        }
        return answer;
    }
}