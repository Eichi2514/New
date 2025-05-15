package programmers.LV0.p181909;

import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }
        Arrays.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution("banana");
        String[] result2 = new Solution().solution("programmers");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}