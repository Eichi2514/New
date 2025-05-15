package programmers.LV0.p120885;

class Solution {
    public static String solution(String bin1, String bin2) {
        int i = Integer.parseInt(bin1, 2);
        int j = Integer.parseInt(bin2, 2);
        int sum = i + j;
        String answer = Integer.toBinaryString(sum);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("10", "11"));
        System.out.println(new Solution().solution("1001", "1111"));
    }
}