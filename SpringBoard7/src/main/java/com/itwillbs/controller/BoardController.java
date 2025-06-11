package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	// http://localhost:8088/board/register (o) 
	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public void boardRegistGET() {
		
		logger.info(" boardRegistGET() 실행 ");
		logger.info(" /views/board/regist.jsp 페이지로 이동");
		
	}
	// 글쓰기 (정보처리) / POST
	
	
	
} // BoardController 끝
