package programmers.LV0.p181846;

import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        String answer = String.valueOf(A.add(B));
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("582", "734"));
        System.out.println(new Solution().solution("18446744073709551615", "287346502836570928366"));
        System.out.println(new Solution().solution("0", "0"));
    }
}