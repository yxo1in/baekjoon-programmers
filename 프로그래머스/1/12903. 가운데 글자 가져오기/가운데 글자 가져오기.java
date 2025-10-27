class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            ch[i] = s.charAt(i);
        }
        if(s.length() % 2 == 0){
                answer += ch[s.length() / 2 - 1];
                answer += ch[s.length() / 2];
            }
            else
                answer += ch[s.length() / 2];
        return answer;
    }
}