package programmers.LV0.p120887;

class Solution {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String tmp = "";
        String t = Integer.toString(k);
        for (int a = i; a <= j; a++) {
            tmp = Integer.toString(a);
            if (tmp.length() == 1) {
                if (a == k) answer++;
            } else {
                for (int b = 0; b < tmp.length(); b++) {
                    String m = String.valueOf(tmp.charAt(b));
                    if (t.equals(m)) answer++;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1, 13, 1));
        System.out.println(new Solution().solution(10, 50, 5));
        System.out.println(new Solution().solution(3, 10, 2));
    }
}