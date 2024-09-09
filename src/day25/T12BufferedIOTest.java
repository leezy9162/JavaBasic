package day25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 입출력 성능 향상을 위한 보조스트림 객체 사용 예제
 * (문자기반의 BufferedStream 객체를 사용)
 */
public class T12BufferedIOTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//이클립스에서 만든 자바프로그램이 실행되는 기본 위치는 
			//해당 '프로젝트폴더'가 기본(현재) 위치가 된다.
			fr = new FileReader("src/kr/or/ddit/basic/T11BufferedIOTest.java");
			br = new BufferedReader(fr);
			
			//BufferedRead의 readLine()은 한줄씩 읽어온다.
			String tempStr = "";
			int cnt = 1;
			while ((tempStr=br.readLine()) != null) {
				System.out.printf("%4d : %s \n", cnt++, tempStr);
			}
			
			//기존에 한 바이트씩 읽어오던 방식(느리다...)
//			int data = 0;
//			while ((data = fr.read()) != -1) {
//				System.out.print((char) data);
//			}
			System.out.println();
			System.out.println("읽기 작업 끝...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
