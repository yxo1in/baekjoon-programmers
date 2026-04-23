class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        int[] cnt = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            cnt[strArr[i].length() - 1]++;
        }
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] > max){
                max = cnt[i];
            }
        }
        return max;
    }
}