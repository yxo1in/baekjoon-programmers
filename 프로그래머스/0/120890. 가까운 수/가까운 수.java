import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        boolean flag[] = new boolean[array.length];
        int min = Integer.MAX_VALUE;
        int idx = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] - n < 0){
                flag[i] = false;
            }
            else{
                flag[i] = true;
            }
            if(min > Math.abs(array[i] - n)){
                min = Math.abs(array[i] - n);
                idx = i;
            }
        }
        return flag[idx] ? n + min : n - min;
    }
}