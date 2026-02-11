import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 정수 추출 방식이
 * Scanner로 입력 받는 경우와
 * BufferedReader로 입력 받는 경우로 나뉘는데
 * Scanner로 받은 경우에는 charAt()으로 가능함
 * 근데 BufferedReader로 받은 경우에는
 * getBytes()로 받아올 수 있음
 */

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String[] arr = new String[26];

        for(int i=0; i<arr.length; i++){
            int index = S.indexOf('A' + i);
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }
}
