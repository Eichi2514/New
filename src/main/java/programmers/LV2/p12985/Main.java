package programmers.LV2.p12985;

class Solution{
    public int solution(int n, int a, int b) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if (a % 2 == 0){
                if (a-1 == b) return i;

                a /= 2;

                if (b % 2 == 0) b /= 2;
                else b = (b + 1) / 2;
            } else{
                if (a+1 == b) return i;

                a = (a + 1) / 2;

                if (b % 2 == 0) b /= 2;
                else b = (b + 1) / 2;
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(8, 4, 7));
    }
}