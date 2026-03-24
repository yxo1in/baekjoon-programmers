class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < answer.length; i++){
            String[] str = quiz[i].split(" ");
            switch(str[1]){
                case "-" ->{
                    if(Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                        answer[i] = "O";
                    }
                    else{
                        answer[i] = "X";
                    }
                }
                case "+" ->{
                    if(Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                        answer[i] = "O";
                    }
                    else{
                        answer[i] = "X";
                    }
                }
            }
        }
        return answer;
    }
}