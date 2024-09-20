package kr.or.ddit.member.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.util.MyBatisUtil;

public class MemberDaoImplForMyBatis implements IMemberDao{

	@Override
	public int insertMember(MemberVO mv) {
		//세션 가져오기
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		
		int cnt = 0;
		try {
			cnt = sqlSession.insert("member.insertMember", mv);
			sqlSession.commit(); //커밋
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return cnt;
	}

	@Override
	public boolean checkMember(String memId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		boolean isExist = false;
		try {
			int cnt = sqlSession.selectOne(memId);
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		return isExist;
	}

	@Override
	public int updateMember(MemberVO mv) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		
		int cnt = 0;
		try {
			cnt = sqlSession.insert("member.updateMember", mv);
			sqlSession.commit(); //커밋
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return cnt;
	}

	@Override
	public int deleteMember(String memId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		
		int cnt = 0;
		try {
			cnt = sqlSession.insert("member.deleteMember", memId);
			sqlSession.commit(); //커밋
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return cnt;
	}

	@Override
	public List<MemberVO> selectAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> searchMember(MemberVO mv) {
		// TODO Auto-generated method stub
		return null;
	}

}
