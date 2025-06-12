package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.BoardVO;

// @RequestMapping(value = "/board/*") //접근할수있는 주소 입력
// => 실행하는 주소가 /board/~ 시작하는 모든 주소를
//    해당컨트롤러가 처리하겠다


@Controller
@RequestMapping(value = "/board/*") //접근할수있는 주소 입력
public class BoardController {

	//mylog //??
	private static final Logger logger = 
			LoggerFactory.getLogger(BoardController.class);
	
	// 기능을 정의
	// ?? void / String 차이??
	// 글쓰기 (정보입력) / GET
	// http://localhost:8088/controller/board/register (x) 톰캣으로 설정 변경 후 도메인 변경
	// http://localhost:8088/board/regist (o) 
	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public void boardRegistGET() {
		
		logger.info(" boardRegistGET() 실행 ");
		logger.info(" /views/board/regist.jsp 페이지로 이동");
		
	}
	// 글쓰기 (정보처리) / POST
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String boradRegistPOST(BoardVO vo) {
		logger.info(" boradRegistPOST() 실행 ");
		
		// 글쓰기 동작을 처리
		
		// 한글처리 인코딩 => web.xml 에 필터설정
		
		// 1) 전달정보(파라메터)를 저장 / 제목, 내용, 이름
		
		logger.info(" vo : " + vo);
		
		
		// 2) 서비스기능 -> DAO기능 -> DB에 저장
		
		
		
		// 3) 페이지 이동(게시판 리스트)
		
		
		return "";
		
	}
	
	
	
} // BoardController 끝
