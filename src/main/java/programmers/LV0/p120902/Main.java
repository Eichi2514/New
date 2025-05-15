package programmers.LV0.p120902;

class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replace("- ", "+ -");
        String[] numbers = my_string.split(" ");
        for (int i = 0; i < numbers.length; i += 2) {
            answer += Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("3 + 4"));
    }
}