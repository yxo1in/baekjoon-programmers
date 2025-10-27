class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int[] temp = new int[n];
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                temp[cnt] = i;
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i++){
            answer[i] = temp[i];
        }
        return answer;
    }
}