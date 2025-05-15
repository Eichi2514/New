package programmers.LV0.p181902;

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            int index = my_string.charAt(i);
            if (index < 91) answer[index - 65]++;
            else if (index > 96) answer[index - 71]++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution("Programmers");

        System.out.println(Arrays.toString(result1));
    }
}