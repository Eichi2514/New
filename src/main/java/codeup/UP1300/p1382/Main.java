package codeup.UP1300.p1382;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d x %d = %2d", j, i, i*j);
                if (j != 5) System.out.print("\t");
                else System.out.println();
            }
        }
    }
}