import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                arrList.add(arr[j]);
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}