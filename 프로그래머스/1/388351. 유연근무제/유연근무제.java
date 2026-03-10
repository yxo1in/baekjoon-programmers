class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int temp = startday;
        int answer = 0;
        int[] cnt = new int[schedules.length];
        for(int i = 0 ; i < schedules.length; i++){
            if((schedules[i] + 10) % 100 >= 60){
                schedules[i] += 40;
            }
            startday = temp;
            for (int j = 0; j < timelogs[i].length; j++) {
                if (startday != 6 && startday != 7 && startday != 13) {
                    if (timelogs[i][j] <= schedules[i] + 10) {
                        System.out.println(startday + " : " +i + " : " +(schedules[i] + 10));
                        cnt[i]++;
                    }
                }
                startday++;
            }
        }

        for(int i = 0; i < schedules.length; i++){
            System.out.println(i + " : " +cnt[i]);
            if(cnt[i] == 5){
                answer++;
            }
        }
        return answer;
    }
}