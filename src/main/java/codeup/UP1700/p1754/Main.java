package codeup.UP1700.p1754;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");

        BigInteger n1 = new BigInteger(ss[0]);
        BigInteger n2 = new BigInteger(ss[1]);

        int result = n1.compareTo(n2);

        if (result < 0) System.out.println(n1 + " " + n2);
        else System.out.println(n2 + " " + n1);
    }
}