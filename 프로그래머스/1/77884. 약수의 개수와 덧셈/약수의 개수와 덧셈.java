class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] arr = new int[right - left + 1];
        int index = 0;
        for(int i = left; i <= right; i++){
            arr[index] = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    arr[index]++;
                }
            }
            if(arr[index] % 2 == 0){
                answer += i;
            }
            else
                answer -= i;
            index++;
        }
        return answer;
    }
}