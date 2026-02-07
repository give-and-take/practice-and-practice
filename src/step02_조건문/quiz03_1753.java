package step02_조건문;

import java.util.Scanner;

public class quiz03_1753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a%4==0 && (a%100!=0 || a%400==0)) System.out.println("1");
        else System.out.println("0");
        s.close();
    }
}
