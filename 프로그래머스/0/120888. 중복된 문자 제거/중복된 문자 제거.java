class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(int i = 0; i < ch.length; i++){
            for(int j = i+1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    ch[j] = '\0';
                }
            }
            if(ch[i] != '\0') answer += ch[i];
        }
        return answer;
    }
}