class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        while(true){
            if(arr.length <= len){
                break;
            }
            else
                len *= 2;
        }
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            try{
                answer[i] = arr[i];
            }catch(ArrayIndexOutOfBoundsException e){
                answer[i] = 0;
            }
        }
        return answer;
    }
}