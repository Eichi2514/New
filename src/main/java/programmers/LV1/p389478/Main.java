package programmers.LV1.p389478;

class Solution {
    public int solution(int n, int w, int num) {
        int r = (num - 1) / w;
        int rem = (num - 1) % w;
        int c = (r % 2 == 0) ? rem : (w - 1 - rem);

        int maxRow = (n - 1) / w;
        int count = 1;

        for (int k = r + 1; k <= maxRow; k++) {
            int len = Math.min(w, n - k * w);
            if (len <= 0) break;

            boolean exists;
            if (k % 2 == 0) {
                exists = (c < len);
            } else {
                exists = (c >= w - len);
            }
            if (exists) count++;
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(22, 6, 8));
        System.out.println(new Solution().solution(13, 3, 6));
    }
}