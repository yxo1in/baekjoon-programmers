class Solution {
    public int solution(int n) {
        int answer = 0;
        int b = 1;
        int temp = 1;
        while(true){
            temp *=  b;
            if(temp > n){
                return answer;
            }
            b++;
            answer++;
        }
    }
}