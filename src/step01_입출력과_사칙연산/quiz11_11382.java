package step01_입출력과_사칙연산;

import java.util.Scanner;

public class quiz11_11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();

        System.out.println((a+b+c));

        s.close();
    }
}
