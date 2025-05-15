package programmers.LV0.p120813;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public static int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) a.add(i);
        }
        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(10);
        int[] result2 = new Solution().solution(15);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}