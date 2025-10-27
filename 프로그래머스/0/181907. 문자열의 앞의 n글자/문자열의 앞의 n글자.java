class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // char[] ch = new char[n];
        // for(int i = 0; i < ch.length; i++){
        //     ch[i] = my_string.charAt(i);
        //     answer += ch[i];
        // }
        return my_string.substring(0, n);
    }
}