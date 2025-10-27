import java.util.StringTokenizer;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringTokenizer stk = new StringTokenizer(s, " ");
        int cnt = stk.countTokens();
        int[] num = new int[cnt];
        int i = 0;
        while(stk.hasMoreTokens()){
            num[i] = Integer.parseInt(stk.nextToken());
            i++;
        }
        
        Arrays.sort(num);
        answer += Integer.toString(num[0])+ " ";
        answer += Integer.toString(num[cnt - 1]);
        
        return answer;
    }
}