package programmers.LV0.p120921;

class Solution {
    public static int solution(String A, String B) {
        int answer = -1;
        int count = 0;
        int chack = 0;
        String[] b = B.split("");
        String[] b1 = A.split("");
        String[] b2 = A.split("");
        while (count <= A.length()) {
            for (int i = 0; i < b.length; i++) {
                if (b[i].equals(b1[i])) {
                    chack++;
                }
                if (chack == b.length) {
                    answer = count;
                    chack = -1;
                }
            }
            if (chack == -1) break;
            chack = 0;
            for (int i = 0; i < b.length; i++) {
                if (b[i].equals(b2[i])) {
                    chack++;
                }
                if (chack == b.length) {
                    answer = count;
                    chack = -1;
                }
            }
            if (chack == -1) break;
            chack = 0;
            count++;
            if (count % 2 == 0) {
                b1[0] = b2[b2.length - 1];
                for (int i = 0; i < b1.length - 1; i++) {
                    b1[i + 1] = b2[i];
                }
            } else {
                b2[0] = b1[b1.length - 1];
                for (int i = 0; i < b2.length - 1; i++) {
                    b2[i + 1] = b1[i];
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", "ohell"));
        System.out.println(new Solution().solution("apple", "elppa"));
        System.out.println(new Solution().solution("atat", "tata"));
        System.out.println(new Solution().solution("abc", "abc"));
    }
}