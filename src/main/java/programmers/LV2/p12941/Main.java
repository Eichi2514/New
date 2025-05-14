package programmers.LV2.p12941;

import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 1; i <= A.length; i++) {
            answer += A[i - 1] * B[B.length - i];
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(new Solution().solution(new int[]{1, 2}, new int[]{3, 4}));
    }
}