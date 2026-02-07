package step04_1차원배열;

import java.util.Scanner;

public class quiz04_2562 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[9];

        int max=0, index=0;
        for(int i=0; i<9; i++){
            arr[i] = s.nextInt();
            if(i==0) {
                max=arr[i];
                index = i+1;
            }else{
                if(arr[i] >= max){
                    max = arr[i];
                    index = i+1;
                }
            } 
        }

        System.out.println(max+"\n"+index);
        s.close();
    }
}
