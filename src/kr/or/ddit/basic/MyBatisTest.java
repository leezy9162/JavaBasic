package kr.or.ddit.basic;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.or.ddit.member.vo.MemberVO;

public class MyBatisTest {
	public static void main(String[] args) {
		// myBatis를 이용하여 DB작업을 처리하는 순서
		// [1] myBatis 환경설정 파일을 읽어와 객체를생성한다.
		SqlSessionFactory sessionFactory = null;
		
		try {
			// 1-1. 설정 파일 읽어오기
			// 설정 파일의 인코딩 정보 설정(한글 처리를 위해)
			Charset charset = Charset.forName("UTF-8");
			Resources.setCharset(charset);
			Reader rd = Resources.getResourceAsReader("config/mybatis-config.xml");
			
			// 1-2. Reader 객체를 사용하여 SqlSessionFactory 객체 생성하기
			sessionFactory = new SqlSessionFactoryBuilder().build(rd);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// [2] 실행할 SQL문에 맞는 쿼리문을 호출하여 원하는 작업을 수행한다.
		// 2-1. insert 작업 연습
		System.out.println("insert 작업 시작...");
		
		// 1) 저장할 데이터를 VO에 담는다.
		MemberVO mv = new MemberVO("d002", "백승권", "888-333", "전주시");
		
		// 2) SqlSession 객체를 이용해 해당 쿼리문을 실행한다.
		// ex) SqlSession.insert("namespace값.id값", 파라미터 객체);
		// 반환값은 성공한 레코드 수를 반환한다.
		SqlSession session = sessionFactory.openSession(false); //오토커밋여부 false
		try {
			int cnt = session.insert("memberTest.insertMember", mv);
			
			if (cnt > 0 ) {
				System.out.println("insert 작업 " + cnt +"건 성공!");
				session.commit(); // 작업이 완료되면 커밋하기
			} else {
				System.out.println("insert 작업 실패!");
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close(); // 세션닫기(커밋전이라면 롤백)
		}
		
		
		///////////////////////////////////////////////////////////////
		System.out.println("--------------------------------------");
		// 2-1. update 작업 연습
		System.out.println("update 작업 시작...");
		mv = new MemberVO();
		mv.setMemId("d002");
		mv.setMemName("이지용");
		mv.setMemTel("333-333");
		mv.setMemAddr("서울");
		
		//parameter default - false
		session = sessionFactory.openSession();
		
		try {
			int cnt = session.update("memberTest.updateMember", mv);
			if (cnt > 0) {
				System.out.println("update 작업 성공!");
				session.commit();
			} else {
				System.out.println("update 작업 실패!");
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		// 2-3 delete 연습
//		System.out.println("--------------------------------------");
//		System.out.println("delete 작업 시작...");
//		session = sessionFactory.openSession();
//		try {
//			int cnt = session.delete("memberTest.deleteMember", "d002");
//			
//			if (cnt > 0) {
//				System.out.println("delete 작업 성공!");
//				session.commit();
//			} else {
//				System.out.println("delete 작업 실패!");
//			}
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
		
		// 2-4 select 연습
		// 1) 응답의 결과가 여러개일 경우
		System.out.println("--------------------------------------");
		System.out.println("select 연습(응답결과가 여러개일 경우)");
		
		session = sessionFactory.openSession(true);
		
		try {
			//응답결과가 여러개 일 경우에는 selectList() 메서드를 사용한다.
			List<MemberVO> memList = session.selectList("memberTest.getAllMember");
			
			for (MemberVO mv2 : memList) {
				System.out.println("--------------------------------------");
				System.out.println("Id: " + mv2.getMemId());
				System.out.println("Name: " + mv2.getMemName());
				System.out.println("tel: " + mv2.getMemTel());
				System.out.println("Addr: " + mv2.getMemAddr());
				System.out.println("RegDt: " + mv2.getRegDt());
			}
			System.out.println("출력 끝...");
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		// 2) 응답 결과가 한개일 경우
		System.out.println("--------------------------------------");
		System.out.println("select 연습(응답결과가 1개일 경우)");
		session = sessionFactory.openSession(true);
		
		try {
			// 응답결과가 1개인 경우에는 selectOne() 메서드를 이용한다.
			mv = session.selectOne("memberTest.getMember","d002");
			
			System.out.println("--------------------------------------");
			System.out.println("Id: " + mv.getMemId());
			System.out.println("Name: " + mv.getMemName());
			System.out.println("tel: " + mv.getMemTel());
			System.out.println("Addr: " + mv.getMemAddr());
			System.out.println("RegDt: " + mv.getRegDt());
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}
}
