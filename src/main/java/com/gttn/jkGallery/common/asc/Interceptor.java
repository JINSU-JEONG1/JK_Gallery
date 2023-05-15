package com.gttn.jkGallery.common.asc;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;


/**
 * 
 * <p>Api Intercepter</p> 
 *
 * @author Hunwoo Park 
 *
 */
@Slf4j
public class Interceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		log.debug("===============APII BEGIN ====================");
		log.debug("Request URI ===> " + request.getRequestURI());
		
		HttpSession session = request.getSession();
		// HdcUserInfo hui = (HdcUserInfo)session.getAttribute(Const.KEY_HDC_USER_INFO);
		// if(hui == null) {
		// 	//로그인 정보 누락
		// 	logger.debug("== error:9201");
		// 	axError(request, response, ApiResultError.ERROR_INVALID_LOGIN);			
		// 	return false;
		// }
		
		return true;
	}
	
	/**
	 * API 오류 처리
	 * @param request
	 * @param response
	 * @param code
	 */
	private void axError(HttpServletRequest request, HttpServletResponse response, ApiResultError code) {
		ObjectMapper mapper = new ObjectMapper();
		
		response.setContentType("application/json;charset=utf-8");
		
		try {
		} catch (IOException e) {		
			log.error("axError Write Error!", e);
		} 
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		
		log.debug("================APII END ======================");		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
			@Nullable Exception arg3) throws Exception {
	}

}
