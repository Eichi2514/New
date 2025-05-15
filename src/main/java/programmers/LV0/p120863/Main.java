package programmers.LV0.p120863;

class Solution {
    public static String solution(String polynomial) {
        String answer = "";
        if (polynomial.charAt(0) == 'x') polynomial = "1" + polynomial;
        polynomial = polynomial.replaceAll(" x", " 1x");
        String[] numbers = polynomial.split(" \\+ ");
        int xIndex = 0;
        int nIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains("x")) xIndex++;
            else nIndex++;
        }
        String[] x = new String[xIndex];
        String[] n = new String[nIndex];
        xIndex = 0;
        nIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains("x")) {
                x[xIndex] = numbers[i].replace("x", "");
                xIndex++;
            } else {
                n[nIndex] = numbers[i];
                nIndex++;
            }
        }
        int xr = 0;
        int nr = 0;
        for (int i = 0; i < xIndex; i++) {
            xr += Integer.parseInt(x[i]);
        }
        for (int i = 0; i < nIndex; i++) {
            nr += Integer.parseInt(n[i]);
        }
        if (xr == 1) {
            xr = -1;
        }
        answer = Integer.toString(xr) + "x + " + Integer.toString(nr);
        answer = answer.replaceAll(" \\+ 0", "");
        if (answer.charAt(0) == '0') {
            answer = answer.replaceAll("0x \\+ ", "");
        }
        if (answer.equals("0x")) {
            answer = "0";
        }
        if (answer.contains("-1x")) {
            answer = answer.replaceAll("-1x", "x");
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("3x + 7 + x"));
        System.out.println(new Solution().solution("x + x + x"));
    }
}