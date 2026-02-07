package step04_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class quiz09_10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken()); 

            for(int j=0; j<(b-a+1)/2; j++){
                int temp = arr[a-1+j];
                arr[a-1+j] = arr[b-1-j]; 
                arr[b-1-j] = temp;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }
}
