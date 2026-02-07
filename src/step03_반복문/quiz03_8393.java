package step03_반복문;

import java.util.Scanner;

public class quiz03_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int sum = 0;
        for(int i=1; i<a+1; i++){
            sum += i;
        }
        
        System.out.println(sum);
        s.close();
    }
}
