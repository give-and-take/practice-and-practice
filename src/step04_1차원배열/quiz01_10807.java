package step04_1차원배열;

import java.util.Scanner;

public class quiz01_10807 {    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        
        int v = s.nextInt();

        for(int i=0; i<n; i++){
            if(arr[i] == v){
                cnt++;
            }
        }

        System.out.println(cnt);
    
        s.close();
    }

}
