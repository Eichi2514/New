package programmers.LV0.p120839;

class Solution {
    public static String solution(String rsp) {
        rsp = rsp.replace("0", "1");
        rsp = rsp.replace("2", "3");
        rsp = rsp.replace("5", "6");
        rsp = rsp.replace("1", "5");
        rsp = rsp.replace("3", "0");
        String answer = rsp.replace("6", "2");
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("2"));
        System.out.println(new Solution().solution("205"));
    }
}