package day19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class T12PropertiesTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * Properties 객체는 Map보다 축소된 기능의 객체라고 볼 수 있다.
		 * Map은 모든 타입의 객체를 key와 value값으로 사용할 수 있지만
		 * Properties객체는 String만 key, value에 사용할 수 있다.
		 */
		Properties prop = new Properties();
		
		prop.setProperty("name", "홍길동");
		prop.setProperty("tel", "010-11111-222222");
		prop.setProperty("addr", "대전시");
		
		String name = prop.getProperty("name");
		String tel = prop.getProperty("tel");
		
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + tel);
		System.out.println("주소: " + prop.getProperty("addr"));
		
		//데이터 파일로 저장하기
		//한글이 유니코드로 저장됨
//		prop.store(new FileOutputStream(".src/kr/or/ddit/basic/test.Properties"), "코멘트(Comment)입니다.");
		
		//Properties 파일 읽기 예제
		prop.load(new FileReader("src/kr/or/ddit/basic/test.Properties"));
		//Properties 파일을 읽어와서 해당 키의 value를 읽어온다.
		//fruit key는 property 파일을 직접 작성했었다.
		System.out.println("읽어온 데이터...");
		System.out.println(prop.getProperty("fruit"));
	}
}
