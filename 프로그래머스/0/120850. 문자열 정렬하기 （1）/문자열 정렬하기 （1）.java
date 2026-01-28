import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
        int index = 0;
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= '0' && ch[i] <='9'){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= '0' && ch[i] <='9'){
                answer[index] = ch[i] - '0';
                index++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}