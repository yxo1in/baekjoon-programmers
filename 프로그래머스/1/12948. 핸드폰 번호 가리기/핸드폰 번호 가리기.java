class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] ch = new char[phone_number.length()];
        for(int i = 0; i < phone_number.length(); i++){
            ch[i] = phone_number.charAt(i);
            if(i < phone_number.length() - 4){
                ch[i] = '*';
            }
            answer += ch[i];
        }
        return answer;
    }
}