package programmers.LV1.p12916;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pcount = 0;
        int Ycount = 0;
        String[] tmps = s.split("");
        for (int i = 0; i < tmps.length; i++) {
            if (tmps[i].equals("P") || tmps[i].equals("p1")) Pcount++;
            else if (tmps[i].equals("Y") || tmps[i].equals("y")) Ycount++;
        }
        if (Pcount != Ycount) answer = false;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("pPoooyY"));
        System.out.println(new Solution().solution("Pyy"));
    }
}