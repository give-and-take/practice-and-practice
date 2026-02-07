package step04_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz07_5597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 30;
        int[] arr = new int[n];
        
        for(int i=0;i<28;i++){
            int num = Integer.parseInt(br.readLine());
            arr[num-1] = num;
        }

        for(int i=0;i<n;i++){
            if(arr[i]==0) bw.write((i+1)+"\n");
        }
        bw.flush();
    }
}
