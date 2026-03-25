class Solution {
    public int[] solution(String my_string) {
        char[] ch = new char[52];
        for(int i = 0; i < ch.length; i++){
            if(i < 26){
                ch[i] += (char)(i + 65);
            }
            else{
                ch[i] += (char)(i + 71);
            }
        }
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < answer.length; j++){
                if(my_string.charAt(i) == ch[j]){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}