package step05_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 단어 하나의 char 문자 추출 방식 숙지 필요 - - - charAt
 * 아스키코드에 따른 인덱스 값 구하는 방식 숙지 필요 - - - -'a'
 */
public class quiz06_10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);

            int index = c-'a';
            if(arr[index] == -1){
                arr[index] = i;
            }
        }
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }
}
