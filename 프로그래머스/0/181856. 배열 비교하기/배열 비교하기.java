class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                answer = 1;
            }
            else
                answer = -1;
        }
        else{
            for(int i = 0; i < arr1.length; i++){
                answer += arr1[i];
            }
            for(int i = 0; i < arr2.length; i++){
                answer -= arr2[i];
            }
            if(answer > 0){
                answer = 1;
            }
            else if(answer == 0){
                answer = 0;
            }else
                answer = -1;
        }
        return answer;
    }
}