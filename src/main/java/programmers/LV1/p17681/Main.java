package programmers.LV1.p17681;

import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String temp1 = String.format("%32s", Integer.toBinaryString(arr1[i])).replace(' ', '0').substring(32 - n);
            String temp2 = String.format("%32s", Integer.toBinaryString(arr2[i])).replace(' ', '0').substring(32 - n);
            StringBuilder temp3 = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (temp1.charAt(j) == '1' || temp2.charAt(j) == '1') {
                    temp3.append('#');
                } else {
                    temp3.append(' ');
                }
            }
            answer[i] = temp3.toString();
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        String[] result2 = new Solution().solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}