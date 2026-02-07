package step03_반복문;

import java.util.Scanner;

public class quiz12_10951 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true) {
            int a = s.nextInt();
            int b = s.nextInt();
            if(a==0 && b==0) break;
            System.out.println(a+b);
        }
        s.close();
    }
}
