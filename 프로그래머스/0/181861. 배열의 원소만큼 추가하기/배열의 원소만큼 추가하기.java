class Solution {
    public int[] solution(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            temp += arr[i];
        }
        int[] answer = new int[temp];
        int a = 0;
        for(int i = 0; i < arr.length; i++){
        int k = 0;
            for(int j = arr[i]; k < j; k++){
                answer[a] = j;
                a++;
            }
        }
        return answer;
    }
}