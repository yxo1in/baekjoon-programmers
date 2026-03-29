class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] str = new String[j - i + 1];
        for(int idx = 0; idx < str.length; idx++){
            str[idx] = Integer.toString(i);
            i++;
        }
        for(int idx = 0; idx < str.length; idx++){
            for(int jdx = 0; jdx < str[idx].length(); jdx++){
                if(str[idx].charAt(jdx) == (char)(k + '0')){
                    answer++;
                }
            }
        }
        return answer;
    }
}