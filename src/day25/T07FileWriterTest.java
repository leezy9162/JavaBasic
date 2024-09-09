package day25;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class T07FileWriterTest {
	public static void main(String[] args) {
		/*
		 * 사용자가 입력한 내용을 그대로 파일로 저장하기
		 * 
		 * 콘솔(표준 입출력장치)와 연결된 입력용 문자스트림 객체 생성
		 * **InputStreamReader => 바이트기반 스트림을 문자기반 스트림으로 변환해 주는 보조 스트림**
		 */
		
		//InputStreamReader 는 보조 스트림이과 System.in은 기반 스트림이다
		//콘솔창으로 들어오는 데이터는 바이트 기반으로 들어오는데 이를 문자(char) 기반 입력 스트림으로 바꿔주고 있는 것이다.
		InputStreamReader isr = new InputStreamReader(System.in); 
		FileWriter fw = null;
		
		
		try {
			//파일 출력용 문자기반 출력 스트림 객체 생성하기
			fw = new FileWriter("d:/D_Other/testChar.txt");
			
			int data = 0;
			
			System.out.println("아무거나 입력하세요.");
			
			///콘솔에서 입력할 때 입력의 끝을 나타내는 문자는 Ctrl + Z키를 누르면 된다.
			//보조 스트림이 char 기반으로 작동하기 때문에 더 큰 범위의 타입인 int 변수에 담는 것은 문제가 되지 않는다.
			while ((data = isr.read())!=-1) {
				fw.write(data);
			}
			
			System.out.println("작업끝 ...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
