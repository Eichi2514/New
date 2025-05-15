package programmers.LV0.p181837;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano")) answer += 4500;
            else if (order[i].contains("cafelatte")) answer += 5000;
            else answer += 4500;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(new Solution().solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }
}