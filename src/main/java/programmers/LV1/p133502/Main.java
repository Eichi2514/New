package programmers.LV1.p133502;

import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        ArrayList<Integer> stack = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);

            int size = stack.size();
            if (size >= 4 &&
                    stack.get(size - 4) == 1 &&
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 1) == 1) {
                stack.remove(size - 1);
                stack.remove(size - 2);
                stack.remove(size - 3);
                stack.remove(size - 4);
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(new Solution().solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }
}