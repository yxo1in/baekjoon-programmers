class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                arr[cnt] = arr[i];
                cnt++;
            }
        }
        if(cnt != 0){
            int[] answer = new int[cnt];
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr[i];
            }
            java.util.Arrays.sort(answer);
            return answer;
        }
        else{
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
    }
}