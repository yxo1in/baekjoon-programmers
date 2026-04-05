import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        String temp = "";
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> reverseMap = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
            reverseMap.put(i, players[i]);
        }
        for(int i = 0; i < callings.length; i++){
            int value = map.get(callings[i]);
            temp = reverseMap.get(value - 1);
            map.put(callings[i], value-1);
            reverseMap.put(value-1, callings[i]);
            map.put(temp, value);
            reverseMap.put(value, temp);
        }
        answer = reverseMap.values().toArray(new String[0]);
        return answer;
    }
}