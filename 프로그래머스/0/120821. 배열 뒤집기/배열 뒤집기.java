class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
    
        for(int i = 0; i < num_list.length; i++){
            int num = num_list.length -(1 + i);
            answer[i] = num_list[num];
        }
        return answer;
    }
}