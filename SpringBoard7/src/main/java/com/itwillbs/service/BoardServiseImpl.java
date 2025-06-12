package com.itwillbs.service;

import org.springframework.stereotype.Service;

import com.itwillbs.domain.BoardVO;

/**
 * BoardServiseImpl : BoardService 인터페이스를 구현(상속)해서 만든 객체
 * 
 * 객체를 직접 구현X => 주입해서 사용 ( 약한결합의 객체 관계일때 )
 * @Service 객체를 root-context.xml에서 불러올때 서비스 객체로 인식
 * 
 */


@Service
public class BoardServiseImpl implements BoardServise{

	// 오버라이딩 메서드 구현
	@Override
	public void boardRegist(BoardVO vo) throws Exception {
		
		
		
		
		
	}

	
	
}
