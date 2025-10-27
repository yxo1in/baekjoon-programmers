class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; 
        int odd = 1;
        for(int i = 0; i < answer.length; i++){
            answer[i] = odd;
            odd += 2;
        }
        
        return answer;
    }
}