package programmers.LV1.p340199;

class Solution {
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletMax = Math.max(wallet[0], wallet[1]);
        int walletMin = Math.min(wallet[0], wallet[1]);
        int billMax = Math.max(bill[0], bill[1]);
        int billMin = Math.min(bill[0], bill[1]);

        while ((walletMax < billMax || walletMin < billMin) &&
                (walletMax < billMin || walletMin < billMax)) {
            answer++;
            billMax = billMax / 2;
            if (billMax < billMin) {
                int temp = billMax;
                billMax = billMin;
                billMin = temp;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{30, 15}, new int[]{26, 17}));
        System.out.println(new Solution().solution(new int[]{50, 50}, new int[]{100, 241}));
    }
}