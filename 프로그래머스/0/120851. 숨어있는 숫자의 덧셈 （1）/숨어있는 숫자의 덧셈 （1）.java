class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if((int)(ch[i] - 48)>= 1 && (int)(ch[i] - 48)<=9){
                answer += (int)(ch[i] - 48);
            }
        }
        return answer;
    }
}