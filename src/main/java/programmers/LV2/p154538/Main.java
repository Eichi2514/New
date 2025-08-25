package programmers.LV2.p154538;

import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;

        int[] dist = new int[y + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new ArrayDeque<>();
        dist[x] = 0;
        q.add(x);

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == y) return dist[cur];

            int[] nexts = new int[] { cur + n, cur * 2, cur * 3 };
            for (int nx : nexts) {
                if (nx > y) continue;
                if (dist[nx] != -1) continue;
                dist[nx] = dist[cur] + 1;
                q.add(nx);
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(10, 40, 5));
        System.out.println(sol.solution(10, 40, 30));
        System.out.println(sol.solution(2, 5, 4));
    }
}