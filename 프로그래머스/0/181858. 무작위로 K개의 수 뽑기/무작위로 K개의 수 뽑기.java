class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 0; i < arr.length; i++){
            boolean flag = true;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    flag = false;    
                    arr[j] = -1;
                }
            }
        }
        int cnt = 0;
        // while(cnt < k || idx < arr.length){
        //     if(arr[idx] != -1){
        //         answer[cnt] = arr[idx];
        //         cnt++;
        //     }
        //     idx++;
        // }
        for(int i = 0; i < arr.length; i++){
            if(cnt == k){
                break;
            }
            if(arr[i] != -1){
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        for(int i = cnt; i < answer.length; i++){
            answer[i] = -1;
        }
        return answer;
    }
}