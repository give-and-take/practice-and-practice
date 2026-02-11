package step05_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz05_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        byte[] arr = s.getBytes();
        
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += (arr[i] - '0'); // 이 부분이 필수!
        }
        bw.write(sum+"\n");
        bw.flush();
    }
}
