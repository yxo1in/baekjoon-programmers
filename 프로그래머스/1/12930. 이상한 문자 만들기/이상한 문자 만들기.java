import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer stk = new StringTokenizer(s, " ", true);
        while(stk.hasMoreTokens()){
            String str = stk.nextToken();
            if(str.equals(" ")){
                answer += str;    
            }
            else
                for(int i = 0; i < str.length(); i++){
                    if(i % 2 == 0){
                        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                            answer += (char)(str.charAt(i) - 32);
                        else
                            answer += (char)(str.charAt(i));
                    }
                    else{
                        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                            answer += (char)(str.charAt(i) + 32);
                        else
                            answer += str.charAt(i);
                    }
                }
        }
        return answer;
    }
}