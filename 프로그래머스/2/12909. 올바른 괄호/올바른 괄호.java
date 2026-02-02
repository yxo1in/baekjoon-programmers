class Solution {
    boolean solution(String s) {
        int cnt = 0;
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i < ch.length; i++){
            if(ch[i] == '('){
                cnt ++;
            }
            else if(ch[i] == ')')
                cnt --;
            if(cnt < 0){
                return false;
            }
        }
        if(cnt == 0){
            return true;
        }
        else
            return false;
    }
}