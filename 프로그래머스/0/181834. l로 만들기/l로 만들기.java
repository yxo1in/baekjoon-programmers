class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] ch = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++){
            if(ch[i] < 'l'){
                ch[i] = 'l';
            }
            answer += ch[i];
        }
        return answer;
    }
}