import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                d.push(arr[i]);
            }
        }
        int[] answer = new int[d.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = d.removeLast();
        }
        return answer;
    }
}