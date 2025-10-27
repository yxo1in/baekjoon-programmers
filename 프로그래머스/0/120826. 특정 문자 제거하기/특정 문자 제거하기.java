class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char let = letter.charAt(0);
        char[] my = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            my[i] = my_string.charAt(i);
            if(my[i] != let){
                answer += my[i];
            }
        }
        return answer;
    }
}