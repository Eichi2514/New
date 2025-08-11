package programmers.LV2.p76502;

import java.util.*;

class Solution {
    public int solution(String s) {
        int n = s.length();

        String doubled = s + s;
        int answer = 0;

        for (int start = 0; start < n; start++) {
            Deque<Character> st = new ArrayDeque<>();
            boolean ok = true;

            for (int i = start; i < start + n; i++) {
                char c = doubled.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    st.push(c);
                } else {
                    if (st.isEmpty()) { ok = false; break; }
                    char top = st.pop();
                    if (!((top == '(' && c == ')') ||
                            (top == '[' && c == ']') ||
                            (top == '{' && c == '}'))) {
                        ok = false; break;
                    }
                }
            }
            if (ok && st.isEmpty()) answer++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("[](){}"));
        System.out.println(new Solution().solution("}]()[{"));
        System.out.println(new Solution().solution("[)(]"));
        System.out.println(new Solution().solution("}}}"));
    }
}