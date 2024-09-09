package day25;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class T10FileEncodingTest {
	public static void main(String[] args) throws IOException {
		/*
		 * 키보드로 입력한 내용을 파일로 저장하는데,
		 * out_utf8.txt 파일은 'UTF-8' 인코딩 방식으로 저장하며
		 * out_ansi.txt 파일은 'MS949' 인코딩 방식으로 저장한다.
		 */
		
		//사용자의 입력을 받을 System.in 기반 스트림과 보조 스트림
		InputStreamReader isr = new InputStreamReader(System.in);
		
		//파일 출력 스트림 객체 생성하기
		FileOutputStream fos1 = new FileOutputStream("d:/D_Other/out_utf8.txt");
		FileOutputStream fos2 = new FileOutputStream("d:/D_Other/out_ansi.txt");
		
		//OutputStreamWriter => 바이트기반 스트림을 문자기반 스트림으로 변환해주는 보조스트림
		//이 객체도 출력할 때 '인코딩 방식'을 지정할 수 있다.
		OutputStreamWriter osw1 = new OutputStreamWriter(fos1, "UTF-8");
		OutputStreamWriter osw2 = new OutputStreamWriter(fos2, "MS949");
		
		//데이터를 담을 변수 선언
		int data = 0;
		
		System.out.println("입력하세요: ");
		//읽을 값이 없을때까지 읽고 출력 스트림 읽기.
		while ((data = isr.read())!=-1) {
			osw1.write(data);
			osw2.write(data);
		}
		System.out.println("출력작업 완료...");
		
		//스트림 객체 닫기...(보조 스트림만 닫아도 된다.)
		osw1.close();
		osw2.close();
		isr.close();
	}
}
