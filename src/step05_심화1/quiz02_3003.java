package step05_심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class quiz02_3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 6; i++) {
			int result = 0;
			int num = Integer.parseInt(st.nextToken());
			if(i>=0 && i<2) result = 1-num;
			else if(i>=2 && i<=4) result = 2-num;
			else if(i==5) result = 8-num;
			bw.write(result + " ");
		}
		bw.flush();
	}
}
