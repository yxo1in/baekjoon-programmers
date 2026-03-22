import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            arr.add(n);
            if(n == 1){
                break;
            }
            if(n % 2 == 0){
                n /= 2;
            }
            else
                n = n * 3 + 1;
            
        }
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}