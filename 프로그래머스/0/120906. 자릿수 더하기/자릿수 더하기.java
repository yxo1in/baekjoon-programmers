class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 10000000; i > 0; i /= 10){
            answer += n / i;
            n = n % i;
        }
        return answer;
    }
}