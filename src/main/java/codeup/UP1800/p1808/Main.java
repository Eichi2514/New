package codeup.UP1800.p1808;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (ch == 'H') {
                System.out.print("Hello, world! ");
            } else if (ch == 'Q') {
                System.out.print(code + " ");
            } else if (ch == '9') {
                for (int j = 99; j > 2; j--) {
                    System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer. ");
                    System.out.println("Take one down and pass it around, " + (j - 1) + " bottles of beer on the wall. ");
                }
                System.out.println("2 bottles of beer on the wall, 2 bottles of beer. ");
                System.out.println("Take one down and pass it around, 1 bottle of beer on the wall. ");
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer. ");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall. ");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer. ");
                System.out.print("Go to the store and buy some more, 99 bottles of beer on the wall. ");
            }
        }
    }
}
