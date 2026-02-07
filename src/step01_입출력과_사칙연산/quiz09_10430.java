package step01_입출력과_사칙연산;

import java.util.Scanner;

public class quiz09_10430 {    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int resultA = (a+b)%c;
        int resultB = ((a%c)+(b%c))%c;
        int resultC = (a*b)%c;
        int resultD = ((a%c)*(b%c))%c;
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        System.out.println(resultD);

        s.close();
    }
}
