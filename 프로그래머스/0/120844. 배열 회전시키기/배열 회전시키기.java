class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        switch(direction){
            case "right" -> {
                for(int i = 0; i < answer.length; i++){
                    if(i + 1 == numbers.length){
                        answer[0] = numbers[i];
                    }
                    else{
                        answer[i+1] = numbers[i];
                    }
                }
            }
            case "left" -> {
                for(int i = 0; i < answer.length; i++){
                    if(i - 1 < 0){
                        answer[answer.length -1] = numbers[i];
                    }
                    else{
                        answer[i-1] = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}