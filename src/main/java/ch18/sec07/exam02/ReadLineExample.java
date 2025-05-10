package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) {
        // 실행 환경과 상관없이 .java 파일을 확실히 가리키도록 절대 경로 확인
        File file = new File("src/main/java/ch18/sec07/exam02/ReadLineExample.java");

        // 파일 존재 여부 확인
        if (!file.exists()) {
            System.out.println("❌ 파일을 찾을 수 없습니다: " + file.getAbsolutePath());
            return;
        }

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int lineNo = 1;
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(lineNo + "\t" + str);
                lineNo++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
