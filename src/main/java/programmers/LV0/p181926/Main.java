package programmers.LV0.p181926;

class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') answer++;
            else if (control.charAt(i) == 's') answer--;
            else if (control.charAt(i) == 'd') answer += 10;
            else if (control.charAt(i) == 'a') answer -= 10;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(0, "wsdawsdassw"));
    }
}