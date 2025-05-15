package programmers.LV0.p120864;

class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        String tmp = "";
        for (int i = 0; i < my_string.length(); i++) {
            int index1 = 0;
            int index2 = 0;
            if (my_string.charAt(i) < 58) {
                index1 = i;
                while (i < my_string.length()) {
                    i++;
                    if (i < my_string.length() && my_string.charAt(i) >= 58) {
                        index2 = i;
                        break;
                    } else if (i == my_string.length()) {
                        index2 = i;
                        break;
                    }
                    ;
                }
                if (index2 == 0) {
                    answer += Integer.parseInt(String.valueOf(my_string.charAt(index1)));
                } else {
                    answer += Integer.parseInt(my_string.substring(index1, index2));
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aAb1B2cC34oOp"));
        System.out.println(new Solution().solution("1a2b3c4d123Z"));
    }
}