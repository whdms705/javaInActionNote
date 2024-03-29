package ch03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* 실행 어라운드 패턴
 */

public class LamdaTest{
    public static void main(String[] args) throws IOException {

        String result = processFile02((BufferedReader br)->br.readLine()+br.readLine());


    }

    // 파일을 읽어오는 기본 소스
    public static String processFile01()throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine(); // 실제 필요한 작업을 하는 행이다.
        }
    }

    // 파라미터화 한다
    public static String processFile02(BufferedReaderProcessor p)throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }



}
