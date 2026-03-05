// 더 많이 선물 준 사람이 적게 준 사람한테 다음달에 선물 하나 받기
// 선물 같은 양을 줬다면 선물 지수(선물을 준 양 - 선물을 받은 양)가 높은 사람이 낮은 사람에게 받기
// 선물 지수도 같다면 선물 x
// 다음 달에 가장 선물을 많이 받는 사람의 선물 개수를 반환

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[] presentCnt = new int[friends.length];
        int amountGifts[] = new int[friends.length];
        int[][] give = new int[friends.length][friends.length];

        for (int i = 0; i < give.length; i++) {
            for (int j = 0; j < give[i].length; j++) {
                for (int k = 0; k < gifts.length; k++) {
                    String[] str = gifts[k].split(" ");
                    if (str[0].equals(friends[i]) && str[1].equals(friends[j]))
                        give[i][j]++;
                }
                System.out.print(give[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < gifts.length; j++) {
                String[] str = gifts[j].split(" ");
                if (str[0].equals(friends[i]))
                    presentCnt[i]++;
                else if (str[1].equals(friends[i]))
                    presentCnt[i]--;
            }
            System.out.println(presentCnt[i]);
        }
        System.out.println();
        for (int i = 0; i < give.length; i++) {
            for (int j = 0; j < give[i].length; j++) {
                if (give[i][j] == give[j][i] && i != j) {
                    if (presentCnt[i] > presentCnt[j]) {
                        amountGifts[i]++;
                    }
                }
                else if(give[i][j] > give[j][i]){
                    amountGifts[i]++;
                }
            }
        }
        for (int i = 0; i < amountGifts.length; i++) {
            System.out.println(amountGifts[i]);
        }      
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < amountGifts.length; i++){
            if(max < amountGifts[i]){
                max = amountGifts[i];
            }
        }
        return max;
    }
}