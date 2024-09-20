package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberService {
	
	public int registMember(MemberVO mv);
	
	public int modifyMember(MemberVO mv);
	
	public int removeMember(String memId);
	
	/**
	 * 회원정보가 존재하는지 확인하기 위한 메서드
	 * @param memId: 회원정보 존재여부 확인하기 위한 회원ID
	 * @return 해당 회원이 존재하면 true, 존재하지 않으면 false 리턴.
	 */
	public boolean checkMember(String memId);
	
	/**
	 * 전체 회원정보를 가져오기 위한 메서드
	 * @return
	 */
	public List<MemberVO> displayAllMember();
	
	/**
	 * 회원정보를 검색하기 위한 메서드
	 * @param mv 검색할 회원정보를 담은 MemberVO 객체 
	 * @return 검색된 회원정보를 담은 List 객체
	 */
	public List<MemberVO> searchMember(MemberVO mv);
}
