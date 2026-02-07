package step02_조건문;

import java.util.Scanner;

public class quiz07_2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int result = 0;
        if(a==b && b==c) result = 10000+a*1000;
        else if ( a==b && b!=c || a==c && a!=b) {
            result = 1000+a*100;
        } else if ( b==c && b!=a ) {
            result = 1000+b*100;
        } else{
            int max = 0;
            if(a>=b && a>=c) max = a;
            else if (b>=a && b>=c) max= b;
            else if (c>=a && c>=b) max = c;

            result = max*100;
        }
        System.out.println(result);

        s.close();
    }
}
