class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0;
        int cnt = 1;
        while(cnt != k){
            idx += 2;
            if(idx >= numbers.length){
                idx -= numbers.length;
            }
            cnt++;
        }
        return numbers[idx];
    }
}