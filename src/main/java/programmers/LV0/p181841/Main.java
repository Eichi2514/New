package programmers.LV0.p181841;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {
            if (!(str_list[i].contains(ex))) {
                answer += str_list[i];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(new Solution().solution(new String[]{"abc", "bbc", "cbc"}, "c"));
    }
}