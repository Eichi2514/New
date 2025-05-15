package programmers.LV0.p120876;

import java.util.Arrays;

class Solution {
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] a = new int[(lines[0][1] - lines[0][0]) + (lines[1][1] - lines[1][0]) + (lines[2][1] - lines[2][0])];
        int index = 0;
        for (int i = lines[0][0]; i < lines[0][1]; i++) {
            a[index] = i + 1;
            index++;
        }
        for (int i = lines[1][0]; i < lines[1][1]; i++) {
            a[index] = i + 1;
            index++;
        }
        for (int i = lines[2][0]; i < lines[2][1]; i++) {
            a[index] = i + 1;
            index++;
        }
        Arrays.sort(a);
        for (int i = a[0]; i <= a[a.length - 1]; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    if (count != 0) {
                        answer++;
                        break;
                    }
                    count++;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(new Solution().solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(new Solution().solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }
}