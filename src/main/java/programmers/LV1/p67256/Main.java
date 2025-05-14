package programmers.LV1.p67256;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int[][] keypad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {-1, 0, -1}
        };

        int[] L = {3, 0};
        int[] R = {3, 2};

        for (int i = 0; i < numbers.length; i++) {
            int target = numbers[i];
            int[] pos = new int[2];

            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 3; y++) {
                    if (keypad[x][y] == target) {
                        pos[0] = x;
                        pos[1] = y;
                    }
                }
            }

            if (target == 1 || target == 4 || target == 7) {
                answer += "L";
                L = pos;
            } else if (target == 3 || target == 6 || target == 9) {
                answer += "R";
                R = pos;
            } else {
                int leftDistance = Math.abs(L[0] - pos[0]) + Math.abs(L[1] - pos[1]);
                int rightDistance = Math.abs(R[0] - pos[0]) + Math.abs(R[1] - pos[1]);

                if (leftDistance < rightDistance) {
                    answer += "L";
                    L = pos;
                } else if (rightDistance < leftDistance) {
                    answer += "R";
                    R = pos;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        L = pos;
                    } else {
                        answer += "R";
                        R = pos;
                    }
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(new Solution().solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }
}