class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] str = {'a', 'e', 'i', 'o', 'u'};
        char[] my = new char[my_string.length()];
        for(int i = 0; i < my.length; i++){
            my[i] = my_string.charAt(i);
            for(int j = 0; j < str.length; j++){
                if(str[j] == my[i]){
                    my[i] ='\0';
                }
            }
            if(my[i] != '\0')
                answer += my[i];
        }
        return answer;
    }
}