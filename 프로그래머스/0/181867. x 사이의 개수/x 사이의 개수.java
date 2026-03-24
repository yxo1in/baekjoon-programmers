import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                arr.add(temp);
                temp = 0;
            }
            else
                temp++;
        }
        arr.add(temp);
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}