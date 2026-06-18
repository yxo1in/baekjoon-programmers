class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = Character.toLowerCase(ch[i]);
            if(i == 0 && ch[i] >= 'a' && ch[i] <= 'z') {
               ch[i] = Character.toUpperCase(ch[i]);
            }
            else if(ch[i] >= 'a' && ch[i] <= 'z' && ch[i-1] == ' '){
                ch[i] = Character.toUpperCase(ch[i]);
            }
            answer += ch[i];
        }
        return answer;
    }
}