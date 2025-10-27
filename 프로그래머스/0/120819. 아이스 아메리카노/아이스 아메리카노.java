class Solution {
    public int[] solution(int money) {
        int[] answer = {0, money};
        while(true){
            if(answer[1] - 5500 >= 0){
                answer[1] -= 5500;
                answer[0]++;
            }
            else
                return answer;
            
        }
    }
}