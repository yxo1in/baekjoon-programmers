class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "0";
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'z'){
                answer += Integer.parseInt(temp);
                temp = "0";
            }
            else{
                temp += my_string.charAt(i);
                if(i == my_string.length()-1){
                    answer += Integer.parseInt(temp);
                }
            }
        }
        return answer;
    }
}