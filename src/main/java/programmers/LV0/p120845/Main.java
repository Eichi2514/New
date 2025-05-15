package programmers.LV0.p120845;

class Solution {
    public static int solution(int[] box, int n) {
        int answer = 0;
        int number = n;

        for (int i = 0; i < 2; i++) {
            number *= n;
        }
        for (int i = 0; i < 3; i++) {
            int count = 0;
            while (true) {
                if (box[i] >= n) {
                    box[i] -= n;
                    count++;
                } else {
                    box[i] = n * count;
                    break;
                }
            }
        }

        if (box[0] == 0 || box[1] == 0 || box[2] == 0) {
            return 0;
        }

        answer = (box[0] * box[1] * box[2]) / number;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 1, 1}, 1));
        System.out.println(new Solution().solution(new int[]{10, 8, 6}, 3));
    }
}