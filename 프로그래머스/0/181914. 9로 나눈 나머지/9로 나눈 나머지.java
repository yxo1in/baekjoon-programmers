class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] ch = number.toCharArray();
        for(int i = 0; i < ch.length; i++){
            answer += ch[i] - '0';
        }
        return answer % 9;
    }
}