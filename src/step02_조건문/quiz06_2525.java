package step02_조건문;

import java.util.Scanner;

public class quiz06_2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(b+c < 60){
            System.out.println(a+" "+(b+c));
        }else{
            int hour = (a + (b+c)/60)%24 ;
            System.out.println(hour + " " + ((b+c)%60));
        }

        s.close();
    }
}
