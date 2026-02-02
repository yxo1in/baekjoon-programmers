class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        if(ch.length == 4 || ch.length == 6){
            for(int i = 0; i < ch.length; i++){
                if(ch[i] >= '0' && ch[i] <= '9')
                    answer = true;
                else
                    return false;
            }
        }
        else
            return false;    
        return answer;
    }
}