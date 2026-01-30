import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        for(int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}