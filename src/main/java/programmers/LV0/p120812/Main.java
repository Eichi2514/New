package programmers.LV0.p120812;

import java.util.Arrays;

class Solution {
    public static int solution(int[] array) {
        int answer = 0;
        int max = 0;

        Arrays.sort(array);
        max = array[array.length - 1];

        int count[] = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        max = count[0];

        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            } else if (count[i] == max) {
                answer = -1;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(new Solution().solution(new int[]{1, 1, 2, 2}));
        System.out.println(new Solution().solution(new int[]{1}));
    }
}