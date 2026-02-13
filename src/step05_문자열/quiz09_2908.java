package step05_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class quiz09_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String S = br.readLine();
        st = new StringTokenizer(S);
        String answer1 = st.nextToken();
        String answer2 = st.nextToken();
        String temp1 = "";
        String temp2 = "";
        for(int i=0; i<3; i++){
            temp1 += answer1.charAt(2-i);
            temp2 += answer2.charAt(2-i);
        }
        int num1 = Integer.parseInt(temp1);
        int num2 = Integer.parseInt(temp2);

        int result = num1>num2?num1:num2;

        bw.write(result+"\n");

        bw.flush();
    }
}
