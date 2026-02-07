package step01_입출력과_사칙연산;

import java.util.Scanner;

public class quiz10_2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int c = a * ( b%10 );
        int d = a * ( (b/10)%10 );
        int e = a * ( b/100 );

        System.out.println(c+"\n"+d+"\n"+e);
        System.out.println(c+d*10+e*100);

        s.close();
    }
}
