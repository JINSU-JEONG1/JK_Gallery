package com.gttn.jkGallery.board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gttn.jkGallery.common.controller.AbstractApiController;
import com.gttn.jkGallery.common.data.ApiResult;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/board")
//@PreAuthorize("isAuthenticated() and hasAnyRole('ROLE_ADMIN')")
@Slf4j
public class BoardApiController extends AbstractApiController{
	 
	public static final String FILE_INPUT_NAME = "event_files";
	
	
	

	//@ApiLogging
	@PostMapping("/test.api")    
	public ApiResult nowTesting() {
		
		// "resultData" 라는 key값으로 value가 HashMap. 내부에 생성되어있는 상태임
		ApiResult result = new ApiResult();
		

		
//		Object mapBoardResult = service어쩌구저쩌구
//		result.addResultData("aboutBoard", mapBoardResult);
		
		
		
		result
			.addResultData("boardNum", "006974")
			.addResultData("boardTitle", "TEST_제목")
			.addResultData("boardContnet", "TEST_TEST_TEST");
		
		
		List<String> listT = new ArrayList<>();
		listT.add("list_a"); listT.add("list_b"); listT.add("list_c");
		result.addResultData("test_list", listT);
		

		Map<String, String> mapT = new HashMap<>();
		mapT.put("key_a", "value_1");
		mapT.put("key_b", "value_2");
		mapT.put("key_c", "value_3");
		result.addResultData("test_map", mapT);
		
		
		return result;
	}
	
	
	
	
	/**
	 *  이벤트 목록
	 * @param request
	 * @param param
	 * @param errors
	 * @return
	 */
//	@ApiLogging
//	@PostMapping("/list.api")    
//	public ApiResult getEventList(
//            HttpServletRequest request,
//            @RequestBody @Validated(ValidTerms0003.class) EventSearchDTO param,
//            Errors errors) {
//                
//        ApiResult axRet = new ApiResult(ApiResultError.ERROR_DEFAULT);        
//        if (errors.hasErrors()) { //파라미터 바인딩 오류시 리턴
//			return bindError(errors, axRet);
//		}
//    	
//		//API Call
//		PageInfo pi = new PageInfo(0, param);
//		List<Map<String, Object>> eventList = eventService.getList(param);
//		int totalItem = eventService.getListCount(param);
//		pi.setCurrentPage(totalItem, param.getPage());
//		
//		axRet.setPageInfo(pi).setSc(param).setList(eventList).set(ApiResultError.NO_ERROR);
//
//        return axRet;
//	}
	
	/**
	 * 이벤트 상세
	 * @param request
	 * @param param
	 * @param errors
	 * @return
	 */
//	@ApiLogging
//	@PostMapping("/get.api")    
//	public ApiResult getEvent(
//			HttpServletRequest request,
//			@RequestBody @Validated(ValidEvent0001.class) EventSearchDTO param,
//			Errors errors) {
//		
//		ApiResult axRet = new ApiResult(ApiResultError.ERROR_DEFAULT);        
//		if (errors.hasErrors()) { //파라미터 바인딩 오류시 리턴
//			return bindError(errors, axRet);
//		}
//		
//		//API Call
//		Map<String, Object> event = eventService.load(param);
//		
//		List<Map<String, Object>> fileList = eventService.getFiles(param);
//		if(fileList != null) {
//			event.put("files", fileList);
//		}
//		axRet.setResultData(event).set(ApiResultError.NO_ERROR);
//		
//		return axRet;
//	}
	
	
}
