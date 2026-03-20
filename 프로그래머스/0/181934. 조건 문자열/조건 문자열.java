class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch(ineq){
            case "<" -> {
                if(eq.equals("=")){
                    if(n <= m){
                        return 1;
                    }
                }
                else if(eq.equals("!")){
                    if(n < m)
                        return 1;
                }
            }
            case ">" ->{
                if(eq.equals("=")){
                    if(n >= m){
                        return 1;
                    }
                }
                else if(eq.equals("!")){
                    if(n > m)
                        return 1;
                }
            }
        }
        return answer;
    }
}