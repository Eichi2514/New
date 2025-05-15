package programmers.LV0.p181869;

import java.util.Arrays;

class Solution {
    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution("i love you");
        String[] result2 = new Solution().solution("programmers");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}