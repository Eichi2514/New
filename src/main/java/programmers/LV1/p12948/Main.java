package programmers.LV1.p12948;

class Solution {
    public String solution(String phone_number) {
        String a = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            a += "*";
        }
        String b = phone_number.substring(phone_number.length() - 4);
        return a + b;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("01033334444"));
        System.out.println(new Solution().solution("027778888"));
    }
}