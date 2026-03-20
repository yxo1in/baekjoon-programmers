import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < num_list.length; i += n){
            arrList.add(num_list[i]);
        }
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}