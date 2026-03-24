class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        c -= 1;
        while(c < my_string.length()){
            answer += my_string.charAt(c);
            c += m;
        }
        return answer;
    }
}