package step02_조건문;

import java.util.Scanner;

public class quiz04_14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if(a>0){
            if(b>0) System.out.println("1");
            else System.out.println("4");
        }else{
            if(b>0) System.out.println("2");
            else System.out.println("3");
        }

        s.close();
    }
}
