import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        String answer = "";
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z')
                answer += (char)(ch[i] - 32);
            else
                answer += (char)(ch[i] + 32);
        }
        System.out.print(answer);
    }
}