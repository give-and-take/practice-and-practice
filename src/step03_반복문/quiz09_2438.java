package step03_반복문;

import java.util.Scanner;

public class quiz09_2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
