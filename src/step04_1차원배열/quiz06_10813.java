package step04_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class quiz06_10813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int x=0; x<N; x++){
            arr[x] = x+1;
        }

        for(int y=0; y<M; y++){
            st=new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(int z=0; z<N; z++){
            bw.write(arr[z]+" ");
        }
        bw.flush();
    }
}
