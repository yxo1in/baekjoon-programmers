class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = 1;
        while(true){
            if((idx * 6) % n == 0){
                return idx;
            }
            else
                idx++;
        }
    }
}