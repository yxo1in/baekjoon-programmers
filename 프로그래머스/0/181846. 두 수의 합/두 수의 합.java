import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        answer = (String.valueOf(new BigInteger(a).add(new BigInteger(b))));
        return answer;
    }
}