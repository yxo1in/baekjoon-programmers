class Solution {
    public String solution(String my_string, String alp) { 
        char[] ch = my_string.toCharArray();
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(ch[i] == alp.charAt(0)){
                ch[i] = Character.toUpperCase(ch[i]);
            }
            answer += ch[i];
        }
        return answer;
    }
}