class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp != 0){
            if(hp - 5 >= 0){
                answer++;
                hp-=5;
            }
            else if(hp - 3 >= 0){
                answer ++;
                hp -= 3;
            }
            else{
                answer++;
                hp -= 1;
            }
        }
        return answer;
    }
}