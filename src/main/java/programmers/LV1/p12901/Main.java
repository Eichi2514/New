package programmers.LV1.p12901;

class Solution {
    public static String solution(int a, int b) {
        int year = 2016;
        if (a < 3) {
            year -= 1;
            a += 12;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (b + (13 * (a + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;

        String[] days = {"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"};
        return days[(h + 7) % 7];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, 24));
    }
}