package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImplForJDBC;
import kr.or.ddit.member.vo.MemberVO;

public class MemberServiceImpl implements IMemberService{
	
	private static IMemberService memService = new MemberServiceImpl();
	
	private IMemberDao memDao;
	
	/**
	 * 생성자
	 * 
	 */
	private MemberServiceImpl() {
		memDao = MemberDaoImplForJDBC.getInstance();
	}
	
	public static IMemberService getInstance() {
		return memService;
	}
	
	@Override
	public int registMember(MemberVO mv) {
		int cnt = memDao.insertMember(mv);
		
		//신규 회원에게 환영메일 발송기능 호출
		
		return cnt;
	}

	@Override
	public int modifyMember(MemberVO mv) {
		int cnt = memDao.updateMember(mv);
		return cnt;
	}

	@Override
	public int removeMember(String memId) {
		int cnt = memDao.deleteMember(memId);
		return cnt;
	}

	@Override
	public boolean checkMember(String memId) {
		return memDao.checkMember(memId);
	}

	@Override
	public List<MemberVO> displayAllMember() {
		List<MemberVO> memList = memDao.selectAllMember();
		return memList;
	}


	@Override
	public List<MemberVO> searchMember(MemberVO mv) {
		List<MemberVO> memList = memDao.searchMember(mv);
		return memList;
	}

}
