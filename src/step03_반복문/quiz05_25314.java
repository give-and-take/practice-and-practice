package step03_반복문;

import java.util.Scanner;

public class quiz05_25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        String result = "long int";
        while(N>4){
            if(N>4) result = "long " + result;
            N-=4;
        }
        System.out.println(result);
        s.close();
    }
}
