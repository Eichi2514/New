package programmers.LV1.p17682;

class Solution {
    public static int tmp(char SDT) {
        return (SDT == 'S' ? 1 : (SDT == 'D' ? 2 : 3));
    }

    public static int solution(String d) {
        int[] scores = new int[3];
        int idx = -1;

        for (int i = 0; i < d.length(); i++) {
            if (Character.isDigit(d.charAt(i))) {
                idx++;
                if (d.charAt(i) == '1' && i + 1 < d.length() && d.charAt(i + 1) == '0') {
                    scores[idx] = 10;
                    i++;
                } else {
                    scores[idx] = d.charAt(i) - '0';
                }
            } else if (d.charAt(i) == 'S' || d.charAt(i) == 'D' || d.charAt(i) == 'T') {
                scores[idx] = (int) Math.pow(scores[idx], tmp(d.charAt(i)));
            } else if (d.charAt(i) == '*') {
                scores[idx] *= 2;
                if (idx > 0) {
                    scores[idx - 1] *= 2;
                }
            } else if (d.charAt(i) == '#') {
                scores[idx] *= -1;
            }
        }

        int answer = 0;
        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(new Solution().solution("1S2D*3T"));
        System.out.println(new Solution().solution("1D2S#10S"));
        System.out.println(new Solution().solution("1D2S0T"));
        System.out.println(new Solution().solution("1S*2T*3S"));
        System.out.println(new Solution().solution("1D#2S*3S"));
        System.out.println(new Solution().solution("1T2D3D#"));
        System.out.println(new Solution().solution("1D2S3T*"));
    }
}