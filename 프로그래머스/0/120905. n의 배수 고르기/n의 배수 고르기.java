class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                numlist[cnt] = numlist[i];
                cnt++;
                
            }
        }
        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i ++){
            answer[i] = numlist[i];
        }
        return answer;
    }
}