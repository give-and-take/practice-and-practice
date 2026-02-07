package step03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class quiz06_15552 {

    public static void main(String[] args) throws IOException {

        /*
         * - 입력이 많을 때 System.out.println을 매번 호출하면 느릴 수 있음
         * - BufferedReader로 빠르게 입력 받고,
         * - BufferedWriter에 결과를 모아 한 번에 출력(flush)해서 속도 개선
         */

        // 1) 입력을 빠르게 받기 위한 도구 (한 줄 단위로 읽음)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2) 출력을 빠르게 하기 위한 도구 (문자열을 버퍼에 모아서 출력)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 3) 한 줄에서 공백 기준으로 토큰(단어)을 분리할 때 사용할 객체
        StringTokenizer st;


         // br.readLine()은 무조건 String으로 들어오므로 int로 바꿔야 함
        int T = Integer.parseInt(br.readLine());

        /*
         * 매 줄마다 "A B" 형태로 들어오는 두 정수를 읽어 합을 출력 버퍼에 쌓는다.
         */
        for (int i = 0; i < T; i++) {

            // 한 줄 입력
            String line = br.readLine();

            // 공백을 기준으로 분리해서 토큰들을 꺼낼 수 있게 준비
            st = new StringTokenizer(line);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write((a + b) + "\n");
        }

        // 버퍼에 쌓인 내용을 한 번에 출력
        bw.flush();
        bw.close();
    }
}
