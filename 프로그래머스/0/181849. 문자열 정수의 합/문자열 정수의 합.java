class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] ch = num_str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            answer += (int)ch[i] - 48;
        }
        return answer;
    }
}