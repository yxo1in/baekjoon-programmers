class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] sChar = s.toCharArray();
        for(int i = 0; i < sChar.length; i++){
            for(int j = 0; j < index; j++){
                sChar[i]++;
                if(sChar[i] > 'z'){
                    sChar[i] = 'a';
                }
                while(skip.indexOf(sChar[i]) != -1){
                    sChar[i]++;
                    if(sChar[i] > 'z'){
                        sChar[i] = 'a';
                    }
                }
                if(sChar[i] > 'z'){
                    sChar[i] = 'a';
                }
            }
            answer += sChar[i];
        }
        return answer;
    }
}