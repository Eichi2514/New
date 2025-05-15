package programmers.LV0.p120894;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String number = "";

        for (int i = 0; i < numbers.length(); i++) {
            if (i != 0 && numbers.charAt(i) == 'z' && numbers.charAt(i + 1) == 'e') {
                number += "0";
                i += 3;
            } else if (numbers.charAt(i) == 'o' && numbers.charAt(i + 1) == 'n') {
                number += "1";
                i += 2;
            } else if (numbers.charAt(i) == 't' && numbers.charAt(i + 1) == 'w') {
                number += "2";
                i += 2;
            } else if (numbers.charAt(i) == 't' && numbers.charAt(i + 1) == 'h') {
                number += "3";
                i += 4;
            } else if (numbers.charAt(i) == 'f' && numbers.charAt(i + 1) == 'o') {
                number += "4";
                i += 3;
            } else if (numbers.charAt(i) == 'f' && numbers.charAt(i + 1) == 'i') {
                number += "5";
                i += 3;
            } else if (numbers.charAt(i) == 's' && numbers.charAt(i + 1) == 'i') {
                number += "6";
                i += 2;
            } else if (numbers.charAt(i) == 's' && numbers.charAt(i + 1) == 'e') {
                number += "7";
                i += 4;
            } else if (numbers.charAt(i) == 'e' && numbers.charAt(i + 1) == 'i') {
                number += "8";
                i += 4;
            } else if (numbers.charAt(i) == 'n' && numbers.charAt(i + 1) == 'i') {
                number += "9";
                i += 3;
            }
        }
        answer = Long.parseLong(number);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(new Solution().solution("onefourzerosixseven"));
    }
}