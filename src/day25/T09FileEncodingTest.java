package day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class T09FileEncodingTest {
/*
 * 한글 인코딩 방식)
 * 한글 인코딩 방식은 크게 UTF-8 과 EUC-KR 방식. 즉, 두가지 방식을 나뉜다.
 * 1. 원래 한글윈도우즈는 CP949방식을 사용했음.
 * 2. 이를 윈도우를 개발한 마이크로소프트사에서 EUC-KR방식에서 확장해서 MS949라고 부르기도 했음.
 * 3. 한글 윈도우즈의 메모장에서 말하는 ANSI인코딩이란 CP949(Code page 949)를 의미.
 * 
 * - MS949(CP949) = > 한글 윈도우즈의 기본 한글인코딩 방식
 * - UTF-8 => 유니코드 UTF-8 인코딩 방식(영문자 및 숫자: 1byte, 한글: 3byte)
 * - US-ASCII => 영문전용 인코딩 방식
 * 
 * 참고) 인코딩 방식의 변천사
 * ASCII => extended ASCII(ISO 8859-1): 조합형, 완성형
 * 
 * => 윈도우계열은 CP494(확장 완성형) + 일부문자(8822자)를 추가함.
 * => 유닉스계열은 EUC-KR(확장 유닉스 코드)
 * 
 * => 위쪽은 그래서 결국 ANSI계열이고 최종적으로 EUC-KR이 이에 해당한다.
 * 
 * => 유니코드는 UTF-8
 */
	public static void main(String[] args) {
		//FileInputStream을 기반 스트림으로 사용하고 InputStreamReader를 보조로 사용
		FileInputStream fis = null;
		InputStreamReader isr = null; //바이트 기반 스트림을 문자 기반 스트림으로 읽어옴
		
		try {
//			fis = new FileInputStream("d:/D_Other/test_ansi.txt");
			fis = new FileInputStream("d:/D_Other/test_utf8.txt");
			
			//파일 인코딩 정보를 이용하여 파일내용 읽어오기
			//ex) new InputStreamReader(기반스트림객체, 인코딩방식);
//			isr = new InputStreamReader(fis, "CP949"); //CP949(MS949)는 윈도우즈가 내부적으로 사용하는 인코딩 방식
			isr = new InputStreamReader(fis, "UTF-8");
			
			int data = 0;
			
			while ((data = isr.read())!= -1) {
				System.out.print((char) data);
			}
			System.out.println();
			System.out.println("출력 끝...");
			//인코딩 방식이 맞지 않으면 데이터가 깨진다...
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close(); //보조 스트림만 닫아도 된다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
