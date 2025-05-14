package programmers.LV2.p12980;

class Solution {
    public int solution(int n) {
        int ans = 0;

        while(n > 0){
            if(n % 2 == 1){
                n--;
                ans++;
            }
            n /= 2;
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5));
        System.out.println(new Solution().solution(6));
        System.out.println(new Solution().solution(5000));
    }
}