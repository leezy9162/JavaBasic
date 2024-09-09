package day25;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 입출력 성능 향상을 위한 보조 스트림 객체 사용 예제
 */
public class T11BufferedIOTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("d:/D_Other/bufferTest.txt");
			
			//버퍼의 크기를 지정하지 않으면 기본적으로 버퍼의 크기가 8192byte(8KB)로 설정된다.
			//버퍼의 크기가 5인 보조 스트림 객체를 생성하기
			bos = new BufferedOutputStream(fos, 5);
			
			//ch = 1 ~ 9까지 write(출력)
			for (char ch = '1'; ch <= '9'; ch++) {
				bos.write(ch);
			}
			//작업을 종료하기 전에 버퍼에 남아있는 데이터를 모두 비운다.(출력한다.)
			bos.flush(); 
			System.out.println("출력 작업 끝...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
