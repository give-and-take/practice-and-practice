package step03_반복문;

import java.util.Scanner;

public class quiz01_2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }

        s.close();
    }
}
