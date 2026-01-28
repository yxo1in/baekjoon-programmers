class Solution {
    public int[] solution(int[] num_list) {
        int numLength = num_list.length;
        int[] answer = new int[numLength + 1];
        if(num_list[numLength - 1] > num_list[numLength - 2]){
            answer[answer.length - 1] = num_list[numLength - 1] - num_list[numLength - 2];
        }
        else{
            answer[answer.length - 1] = num_list[numLength - 1] * 2;
        }
        for(int i = 0; i < numLength; i++){
                answer[i] = num_list[i];
        }
        return answer;
    }
}