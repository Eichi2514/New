package programmers.LV1.p12940;

import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        int max = a;
        int min = (n * m) / max;
        return new int[]{max, min};
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(3, 12);
        int[] result2 = new Solution().solution(2, 5);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}