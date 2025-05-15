package programmers.LV0.p181861;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index += arr[i];
        }
        int[] answer = new int[index];
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{5, 1, 4});
        int[] result2 = new Solution().solution(new int[]{6, 6});
        int[] result3 = new Solution().solution(new int[]{1});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}