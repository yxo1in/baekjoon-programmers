class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        if(Integer.parseInt(as + bs) > 2 * (a * b)){
            answer = Integer.parseInt(as + bs);
        }
        else
            answer = 2 * a * b;
        return answer;
    }
}