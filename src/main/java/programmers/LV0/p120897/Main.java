package programmers.LV0.p120897;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) ns.add(i);
        }
        int[] answer = new int[ns.size()];
        for (int i = 0; i < ns.size(); i++) {
            answer[i] = ns.get(i);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(24);
        int[] result2 = new Solution().solution(29);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}