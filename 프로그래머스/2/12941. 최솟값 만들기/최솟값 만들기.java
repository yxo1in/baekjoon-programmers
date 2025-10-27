import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int cnt = A.length - 1;
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[cnt];
            cnt--;
        }
        return answer;
    }
}