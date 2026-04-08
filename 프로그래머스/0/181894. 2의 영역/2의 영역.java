class Solution {
    public int[] solution(int[] arr) {
        int lastTwo = -1;
        int firstTwo = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                firstTwo = i;
                break;
            }
        }
        for(int j = arr.length - 1; j >= 0; j--){
            if(arr[j] == 2){
                lastTwo = j;
                break;
            }
        }
        if(lastTwo == -1){
            return new int[]{-1};
        }
        int[] answer = new int[lastTwo - firstTwo+1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[firstTwo];
            firstTwo++;
        }
        return answer;
    }
}