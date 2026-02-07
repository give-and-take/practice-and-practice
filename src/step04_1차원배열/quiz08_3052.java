package step04_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz08_3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];
        int cnt = 0;
        for(int i=0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            int index = num%42;
            arr[index]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                cnt++;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
