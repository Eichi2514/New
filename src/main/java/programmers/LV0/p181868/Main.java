package programmers.LV0.p181868;

import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer2 = my_string.split(" ");
        int index = 0;
        for (int i = 0; i < answer2.length; i++) {
            if (!(answer2[i].equals(""))) index++;
        }
        String[] answer = new String[index];
        index = 0;
        for (int i = 0; i < answer2.length; i++) {
            if (!(answer2[i].equals(""))) {
                answer[index] = answer2[i];
                index++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(" i    love  you");
        String[] result2 = new Solution().solution("    programmers  ");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}