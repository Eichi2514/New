package programmers.LV0.p120849;

class Solution {
    public static String solution(String my_string) {
        my_string = my_string.replace("a", "");
        my_string = my_string.replace("e", "");
        my_string = my_string.replace("i", "");
        my_string = my_string.replace("o", "");
        String answer = my_string.replace("u", "");
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("bus"));
        System.out.println(new Solution().solution("nice to meet you"));
    }
}