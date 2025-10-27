class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] my = new char[my_string.length()];
        for(int i = 0; i < my.length; i++){
            my[i] = my_string.charAt(i);
            for(int j = 0; j < n; j++){
                answer += my[i];
            }
        }
        return answer;
    }
}