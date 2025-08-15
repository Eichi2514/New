package programmers.LV2.p64065;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        String inner = s.substring(2, s.length() - 2);
        String[] parts = inner.split("},\\{");

        Arrays.sort(parts, Comparator.comparingInt(p -> p.isEmpty() ? 0 : (int) p.chars().filter(ch -> ch == ',').count() + 1));

        List<Integer> order = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (String part : parts) {
            if (part.isEmpty()) continue;
            for (String numStr : part.split(",")) {
                int num = Integer.parseInt(numStr);
                if (seen.add(num)) {
                    order.add(num);
                }
            }
        }

        return order.stream().mapToInt(i -> i).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(sol.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(sol.solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(sol.solution("{{123}}")));
        System.out.println(Arrays.toString(sol.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}
