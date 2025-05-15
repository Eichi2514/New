package programmers.LV0.p181921;

import java.util.Arrays;

class Solution {
    public static int[] solution(int l, int r) {
        int index = 0;
        for (int i = l; i <= r; i++) {
            if (Integer.toString(i).contains("1") || Integer.toString(i).contains("2") || Integer.toString(i).contains("3") || Integer.toString(i).contains("4") || Integer.toString(i).contains("6") || Integer.toString(i).contains("7") || Integer.toString(i).contains("8") || Integer.toString(i).contains("9")) {
            } else index++;

        }
        if (index == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[index];
        index = 0;
        for (int i = l; i <= r; i++) {
            if (Integer.toString(i).contains("1") || Integer.toString(i).contains("2") || Integer.toString(i).contains("3") || Integer.toString(i).contains("4") || Integer.toString(i).contains("6") || Integer.toString(i).contains("7") || Integer.toString(i).contains("8") || Integer.toString(i).contains("9")) {
            } else {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(5, 555);
        int[] result2 = new Solution().solution(10, 20);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}