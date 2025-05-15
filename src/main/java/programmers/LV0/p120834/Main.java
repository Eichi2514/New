package programmers.LV0.p120834;

class Solution {
    public static String solution(int age) {
        String ageh = Integer.toString(age);
        String[] ageH = ageh.split("");
        String answer = "";
        for (int i = 0; i < ageH.length; i++) {
            if (ageH[i].equals("0")) {
                ageH[i] = "a";
            } else if (ageH[i].equals("1")) {
                ageH[i] = "b";
            } else if (ageH[i].equals("2")) {
                ageH[i] = "c";
            } else if (ageH[i].equals("3")) {
                ageH[i] = "d";
            } else if (ageH[i].equals("4")) {
                ageH[i] = "e";
            } else if (ageH[i].equals("5")) {
                ageH[i] = "f";
            } else if (ageH[i].equals("6")) {
                ageH[i] = "g";
            } else if (ageH[i].equals("7")) {
                ageH[i] = "h";
            } else if (ageH[i].equals("8")) {
                ageH[i] = "i";
            } else if (ageH[i].equals("9")) {
                ageH[i] = "j";
            }
            answer += ageH[i];
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(23));
        System.out.println(new Solution().solution(51));
        System.out.println(new Solution().solution(100));
    }
}