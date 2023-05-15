package com.gttn.jkGallery.board.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gttn.jkGallery.common.controller.AbstractApiController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/event")
@PreAuthorize("isAuthenticated() and hasAnyRole('ROLE_ADMIN')")
@Slf4j
public class BoardApiController extends AbstractApiController{
	
	public static final String FILE_INPUT_NAME = "event_files";
	
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
//	 */
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
