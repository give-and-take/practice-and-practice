package step03_반복문;

import java.util.Scanner;

public class quiz08_11022 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int i=1; i<T+1; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int sum = a+b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+sum);
        }

        s.close();
    }
}
