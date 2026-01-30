class Solution {
    public String solution(String rny_string) {
        String answer = "";
        char[] ch = rny_string.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'm'){
                answer += "rn";
            }
            else
                answer += ch[i];
        }
        return answer;
    }
}