package programmers.LV0.p120850;

import java.util.Arrays;

class Solution {
    public static int[] solution(String my_string) {
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) % 1 == 0 && my_string.charAt(i) < 97) {
                index++;
            }
        }
        int[] answer = new int[index];
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) % 1 == 0 && my_string.charAt(i) < 97) {
                answer[index2] = my_string.charAt(i) - 48;
                index2++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution("hi12392");
        int[] result2 = new Solution().solution("p2o4i8gj2");
        int[] result3 = new Solution().solution("abcde0");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}