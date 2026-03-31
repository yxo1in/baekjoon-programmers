class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[(num_list.length + n-1) / n][n];
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                answer[i][j] = num_list[i*n + j];
            }
        }
        return answer;
    }
}