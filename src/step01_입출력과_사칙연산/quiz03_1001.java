package step01_입출력과_사칙연산;

import java.util.Scanner;

public class quiz03_1001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a-b);
        s.close();
    }
}
