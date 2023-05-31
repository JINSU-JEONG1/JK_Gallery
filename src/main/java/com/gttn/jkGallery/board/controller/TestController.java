package com.gttn.jkGallery.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gttn.jkGallery.common.controller.AbstractApiController;

@Controller
@RequestMapping("/test")
public class TestController extends AbstractApiController{

	@GetMapping("")
	public String index() {
		
		System.out.println("온다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ잇");
		System.out.println("온다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ잇");
		System.out.println("온다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ잇");
		System.out.println("온다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ잇");
		System.out.println("온다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ잇");
		
		return "/templates/index";
	}

//	@GetMapping("test")
//	public String authenticationTest(HttpServletRequest request, HttpSession session, Authentication authentication, Model model) {
//		
//		return "/content/common/test";
//	}

}
