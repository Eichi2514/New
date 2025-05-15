package programmers.LV0.p181866;

import java.util.Arrays;

class Solution {
    public static String[] solution(String myString) {
        while (myString.contains("xx")) {
            myString = myString.replace("xx", "x");
        }
        if (myString.charAt(0) == 'x') myString = myString.substring(1);
        if (myString.charAt(myString.length() - 1) == 'x') myString = myString.substring(0, myString.length() - 1);
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution("axbxcxdx");
        String[] result2 = new Solution().solution("dxccxbbbxaaaa");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}