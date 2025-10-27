class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        char[] ch = new char[str.length()];
        for(int i = 0; i < ch.length; i ++){
            ch[i] = str.charAt(i);
        }
        int i = 0;
        for (int j = ch.length - 1; j >= 0; j--){
            answer[j] = (int)ch[i] - 48;
            i++;
        }
        return answer;
    }
}