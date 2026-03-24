import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                arr.add(todo_list[i]);
            }
        }
        return arr.toArray(new String[0]);
    }
}