import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            boolean flag = false;
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    flag = true;
                }
            }
            if(!flag){
                arrList.add(arr[i]);
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}