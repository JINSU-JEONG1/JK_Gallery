package com.gttn.jkGallery.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractController {

    /**
     * 현재 request 를 얻는다.
     * @return
     */
    protected final HttpServletRequest getRequest() {
    	ServletRequestAttributes reqAttr = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
    	if(reqAttr == null) {
    		return null;
    	}
    	
		HttpServletRequest req = reqAttr.getRequest();
		return req;
	}
	
    
    /**
     * 현재 sesssion 정보를 얻는다
     * @return
     */
    protected final HttpSession getSession() {
    	return getSession(true);
    }
    
    /**
     * 현재 sesssion 정보를 얻는다
     * @param create 현재 새션정보가 없을시 생성여부
     * @return
     */
    protected final HttpSession getSession(boolean create) {
		HttpServletRequest req = getRequest();		
		HttpSession session = req.getSession(create);
		return session;
	}
}
